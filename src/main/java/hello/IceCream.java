package hello;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
@Entity
@Table(name="icecream")
public class IceCream implements Serializable {
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "flavours")
    private String flavours;

    public IceCream(int id, String flavours){
        this.id=id;
        this.flavours=flavours;
    }

    public IceCream()
    { }

    public long getId() {
        return id;
    }

    public String getFlavours() {
        return flavours;
    }

    @Override
    public String toString() {
        return String.format("Icecream[id=%d, flavours='%s']", id, flavours);
    }



}
