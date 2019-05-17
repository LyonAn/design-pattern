
package delegate.simple;

/**
 * @auth an.lv
 */
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("架构", new Leader());
    }
}
