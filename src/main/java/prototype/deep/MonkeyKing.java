
package prototype.deep;

import java.io.*;
import java.util.Date;

public class MonkeyKing extends Monkey implements Cloneable, Serializable {

    public Jingubang jingubang;

    public MonkeyKing(){
        this.birthday = new Date();
        this.jingubang = new Jingubang();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            MonkeyKing copy = (MonkeyKing) ois.readObject();
            copy.birthday = new Date();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public MonkeyKing shallowClone(MonkeyKing target){
        MonkeyKing monkeyKing = new MonkeyKing();
        monkeyKing.height = target.height;
        monkeyKing.weight = target.height;

        monkeyKing.jingubang = target.jingubang;
        monkeyKing.birthday = new Date();
        return  monkeyKing;
    }
}
