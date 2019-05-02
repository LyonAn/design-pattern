
package singleton.threadlocal;

/**
 * @author lyonan
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> instance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return instance.get();
    }
}
