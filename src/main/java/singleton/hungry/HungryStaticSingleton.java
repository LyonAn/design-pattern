
package singleton.hungry;

/**
 * 饿汉式静态块单例
 * @author lyonan
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton INSTANCE;

    static {
        INSTANCE = new HungryStaticSingleton();

    }
    private HungryStaticSingleton (){}

    public static HungryStaticSingleton getInstance(){
        return INSTANCE;
    }
}
