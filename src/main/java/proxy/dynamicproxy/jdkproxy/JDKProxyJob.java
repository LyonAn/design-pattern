
package proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxyJob implements InvocationHandler {

    private Object target;

    public JDKProxyJob(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("提供职业资料。。");
    }

    private void after(){
        System.out.println("找到工作了");
    }

    public Object getTarget() {
        return target;
    }
}
