package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class IceCreamController {
    @RequestMapping("/icecream")
    public IceCream iceCream(@RequestParam(value = "id") int id) {

        String error="NO ID FOUND";
        HashMap<Integer, String> ice = new HashMap<Integer, String>();
        ice.put(1, "Venilla");
        ice.put(2, "Choclate");
        ice.put(3, "StrawBerry");
        ice.put(4, "BlackCurrent");
        ice.put(5, "Pista");

        if(ice.containsKey(id)){
            return new IceCream(id,ice.get(id));
        }
        else {
            return new IceCream(id, error);
        }
                    
    }
}