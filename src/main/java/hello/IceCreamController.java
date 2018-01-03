package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;

@RestController
public class IceCreamController {
    String err="NO SUCH  ID FOUND";
    String[] ice={"Vennila","Choclate","BlackCurrent","Strawberry","Pista"};
    @RequestMapping("/icecream")
    public IceCream iceCream(@RequestParam(value = "id") int id) {

            return new IceCream(id,ice[id]);


    }

    }
