
package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @auth an.lv
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";

    public static final String WECHAT_PAY = "WeChatPay";

    public static final String JD_PAY = "JdPay";

    public static final String DEFAULT = ALI_PAY;

    private static final Map<String, Payment> strategyMap = new HashMap<String, Payment>();

    static {
        strategyMap.put(ALI_PAY, new AliPay());
        strategyMap.put(WECHAT_PAY, new WeChatPay());
        strategyMap.put(JD_PAY, new JdPay());
    }

    public static Payment getPayStrategy(String payWay){
        if(strategyMap.containsKey(payWay)){
            return strategyMap.get(payWay);
        }

        return strategyMap.get(DEFAULT);
    }

}
