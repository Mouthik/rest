package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class IceCreamController {
    private static final String ERROR = "NO ID FOUND";
    @RequestMapping("/icecream")
    public IceCream iceCream(@RequestParam(value = "id") int id) {

        IceCreamData data = new IceCreamData();
        HashMap<Integer, String> ice = data.getIcecreams();

        if(ice.containsKey(id)){
            return new IceCream(id,ice.get(id));
        }
        else {
            return new IceCream(id, ERROR);
        }
                    
    }
}