
package prototype.simple;


import java.util.List;

/**
 * 浅克隆
 * @author lyonan
 */
public class PrototypeA implements Prototype{

    private int id;

    private String name;

    private String address;

    private List hobbies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public PrototypeA clone() {
        PrototypeA prototype = new PrototypeA();
        prototype.setId(this.id);
        prototype.setName(this.name);
        prototype.setAddress(this.address);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }
}
