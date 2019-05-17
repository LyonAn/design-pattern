
package delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @auth an.lv
 */
public class Leader {

    private Map<String, IEmpolyee> targets = new HashMap<String, IEmpolyee>();

    public Leader(){
        targets.put("业务", new EmpolyeeA());
        targets.put("架构", new EmpolyeeB());
    }
    public void dojob(String command) {
        targets.get(command).dojob(command);
    }
}
