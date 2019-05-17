
package delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 简单模拟 DispatchServlet 分发
 * @auth an.lv
 */
public class DispatchServlet extends HttpServlet {


    /**
     * 策略集合
     */
    private List<Handler> handlers = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        Class<?> clazz = OrderController.class;
        try {
            //往策略集合中添加 controller 层类（举例，单个方法）
            handlers.add(new Handler().setController(clazz.newInstance())
            .setMethod(clazz.getMethod("getOrderById", new Class[]{String.class}))
            .setUri("/order/getOrderById.action"));

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //分发请求
            doDisPatch(req,resp);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    private void doDisPatch(HttpServletRequest req, HttpServletResponse resp) throws InvocationTargetException, IllegalAccessException {

        String uri = req.getRequestURI();

        //获取请求路径对应的分发对象
        Handler handle = null;
        for(Handler h : handlers){
           if(uri.equals(h.getUri())){
               handle = h;
               break;
           }
        }

        //调用分发对象中对应请求路径的方法，并传递参数
        Object obj = handle.getMethod().invoke(handle.getController(),req.getParameter("xxx"));

        //返回值
        //resp.getWriter().write(obj);
    }
    /**
     * 策略类
     */
    class Handler {
        private String uri;
        private Method method;
        private Object controller;

        public String getUri() {
            return uri;
        }

        public Handler setUri(String uri) {
            this.uri = uri;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }
    }
}
