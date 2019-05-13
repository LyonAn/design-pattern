
package proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxyLove implements InvocationHandler {

    private Object target;

    public JDKProxyLove(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("先提供一辆车。。");
    }

    private void after(){
        System.out.println("找到了普通人家");
    }

    public Object getTarget() {
        return target;
    }
}
