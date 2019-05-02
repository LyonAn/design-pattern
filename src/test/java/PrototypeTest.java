import prototype.deep.MonkeyKing;
import prototype.simple.Client;
import prototype.simple.PrototypeA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyonan
 */
public class PrototypeTest {
    public static void main(String[] args) {

//        PrototypeA pa = new PrototypeA();
//        pa.setId(1);
//        pa.setName("lvan");
//        pa.setAddress("zhejiang kaihua");
//        List hobbies = new ArrayList();
//        pa.setHobbies(hobbies);
//
//        Client client = new Client(pa);
//        PrototypeA pa2 = (PrototypeA) client.getPrototype();
//        System.out.println("克隆前引用对象：" + pa.getHobbies());
//        System.out.println("克隆后引用对象：" + pa2.getHobbies());
//
//        System.out.println(pa.getHobbies() == pa2.getHobbies());

        MonkeyKing monkeyKing = new MonkeyKing();

        try {
            MonkeyKing copyMonkeyKing = (MonkeyKing)monkeyKing.clone();
            System.out.println("深克隆：" + (monkeyKing.jingubang == copyMonkeyKing.jingubang));
        } catch (Exception e) {
            e.printStackTrace();
        }


        MonkeyKing copyMonkeyKing2 = monkeyKing.shallowClone(monkeyKing);
        System.out.println("浅克隆：" + (monkeyKing.jingubang == copyMonkeyKing2.jingubang));
    }
}
