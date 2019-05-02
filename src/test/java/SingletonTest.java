import singleton.ExcuterThread;
import singleton.lazy.LazyDoubleCheckSingleton;
import singleton.lazy.LazyInnerClassSingleton;
import singleton.lazy.LazySimpleSingleton;

import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String[] args) {

//        Thread t1 = new Thread(new ExcuterThread());
//        Thread t2 = new Thread(new ExcuterThread());
//        t1.start();
//        t2.start();

        try {

            //反射方式破坏单例
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            c.newInstance();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
