package singleton.lazy;

/**
 * 懒汉模式
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static final LazySimpleSingleton lazy;

    static{
        lazy = new LazySimpleSingleton();
    }

    public static LazySimpleSingleton getInstance(){
        return lazy;
    }

}
