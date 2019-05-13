
package proxy.staticproxy;

public class RealSubject implements Subject{
    public void dojob() {
        System.out.println("执行真正的业务逻辑。。。");
    }
}
