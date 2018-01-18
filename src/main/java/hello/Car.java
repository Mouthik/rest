package hello;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="car")
public class Car implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "owner")
    private String owner;
    @Column(name = "color")
    private String color;
    @Column(name = "type")
    private String type;

    public Car(){}
    public Car (int id,String name,String owner,String color,String type){
        this.id=id;
        this.name=name;
        this.owner=owner;
        this.color=color;
        this.type=type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return String.format("Car[id=%d,name='%s',owner='%s',color='%s',type='%s']",id,name,owner,color,type);
    }

}
