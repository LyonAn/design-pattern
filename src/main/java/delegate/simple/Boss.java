
package delegate.simple;

/**
 * @author an.lv
 */
public class Boss {
    public void command(String command, Leader leader){
        leader.dojob(command);
    }
}
