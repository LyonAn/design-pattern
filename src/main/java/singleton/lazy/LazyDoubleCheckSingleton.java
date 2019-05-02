
package singleton.lazy;

/**
 * 双重检查
 */
public class LazyDoubleCheckSingleton {

    /**volatile 规避对象创建语句执行时的指令重排序
     */
    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        //添加外层判断语句可以保证每个线程一定进入该方法
        if(instance == null){
            //synchronized 关键字放到方法里可以防止类被锁住，导致类的其他功能无法被调用
            synchronized (LazyDoubleCheckSingleton.class){
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
}
