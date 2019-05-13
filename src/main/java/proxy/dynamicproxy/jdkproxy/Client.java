
package proxy.dynamicproxy.jdkproxy;


public class Client {
    public static void main(String[] args) {
        JDKProxyFactory factory = new JDKProxyFactory();
        Person person4Love = (Person)factory.getProxyInstance(new JDKProxyLove(new Boy()));
        Person person4Job = (Person)factory.getProxyInstance(new JDKProxyJob(new Boy()));
        person4Love.findLove();
        System.out.println("--------------");
        person4Job.findJob();
    }
}
