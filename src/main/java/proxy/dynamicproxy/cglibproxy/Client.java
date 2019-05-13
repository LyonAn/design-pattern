
package proxy.dynamicproxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        Customer customer = (Customer) new CglibProxyLove().getInstance(Customer.class);
        customer.findLove();
    }
}
