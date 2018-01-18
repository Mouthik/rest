package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class IceCreamController {


    @Autowired
    IceCreamRepository repository;

    private static final String ERROR = "NO ID FOUND";

    @Autowired
    private IceCreamData data;

    @RequestMapping("/icecream")
    public IceCream iceCream(@RequestParam(value = "id") int id) {

        HashMap<Integer, String> ice = data.getIcecreams();
        if(ice.containsKey(id)){
            return new IceCream(id,ice.get(id));
        }
        else {
            return new IceCream(id, ERROR);
        }
                    
    }
    @RequestMapping("/icecream/{id}")
    public IceCream findById(@PathVariable(value = "id")int id ){
        IceCream result;
        result = repository.findOne((long) id);
       if(result!=null){
        return result;
       }else {
           return new IceCream(id, ERROR);
       }
    }
    @RequestMapping(value="/icecream",method= RequestMethod.POST)
    public ResponseEntity<String> createIceCream(@RequestBody IceCream i){
        repository.save(i);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}