package hello;

public class IceCream {
    private int id;
    private String icecream;
    public IceCream(int id, String icecream){
        this.id=id;
        this.icecream=icecream;
    }

    public String getIcecream() {
        return icecream;
    }

    public int getId() {
        return id;
    }
}
