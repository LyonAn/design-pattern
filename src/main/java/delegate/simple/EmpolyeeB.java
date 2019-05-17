
package delegate.simple;

/**
 * @auth an.lv
 */
public class EmpolyeeB implements IEmpolyee {
    public void dojob(String command) {
        System.out.println("我是员工 B 正在干：" + command);
    }
}
