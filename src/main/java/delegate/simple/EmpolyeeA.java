
package delegate.simple;

/**
 * @auth an.lv
 */
public class EmpolyeeA implements IEmpolyee {
    public void dojob(String command) {
        System.out.println("我是员工 A 正在干："+ command);
    }
}
