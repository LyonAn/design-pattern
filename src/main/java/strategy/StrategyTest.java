
package strategy;

/**
 * @auth an.lv
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1","20180311001000009",1000);
        System.out.println(order.pay(PayStrategy.ALI_PAY));

    }
}
