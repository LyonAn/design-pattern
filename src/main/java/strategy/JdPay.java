
package strategy;

/**
 * @auth an.lv
 */
public class JdPay extends Payment{


    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
