
package singleton;

import singleton.hungry.HungrySimpleSingleton;
import singleton.lazy.LazySimpleSingleton;

public class ExcuterThread implements Runnable {
    public void run() {
//        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();

        HungrySimpleSingleton instance = HungrySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+": " + instance);
    }
}
