
package singleton.lazy;

/**
 * 内部类实现单例
 * 解决了懒汉模式的内存浪费，饿汉模式下 sychronized 的性能问题
 */
public class LazyInnerClassSingleton {

    private static LazyInnerClassSingleton instance = null;

    private LazyInnerClassSingleton(){
        //防止通过反射调用私有构造方法
        //在判断逻辑执行之前，LazyHolder.INSTANCE 取值时就执行初始化常量 INSTANCE
        if(LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例！");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }


    //静态内部类在被外部类调用时才会初始化
    private static class LazyHolder{
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}
