
package proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());

        proxy.dojob();
    }
}
