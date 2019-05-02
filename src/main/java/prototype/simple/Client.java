
package prototype.simple;

public class Client {
    private Prototype prototype;

    public Client(Prototype p){
        this.prototype = p;
    }
    public Prototype getPrototype(){
        return (Prototype)prototype.clone();
    }
}
