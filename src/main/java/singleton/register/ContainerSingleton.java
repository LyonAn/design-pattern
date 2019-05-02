
package singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器注册单例实现
 * @author lyonan
 */
public class ContainerSingleton {

    private ContainerSingleton (){};

    private static  Map<String, Object> container = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className){

        synchronized (container){

            if(!container.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    container.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else {
                return container.get(className);
            }
        }

    }

}
