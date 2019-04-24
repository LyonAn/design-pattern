
package singleton.hungry;

/**
 * 饿汉模式
 */
public class HungrySimpleSingleton {

    private static HungrySimpleSingleton hungry;

    private HungrySimpleSingleton(){}

    //使用 synchronized 修饰方法，解决线程安全问题，但存在性能问题
    public synchronized static HungrySimpleSingleton getInstance(){
        if(hungry == null){
            hungry = new HungrySimpleSingleton();
        }
        return hungry;
    }


}
