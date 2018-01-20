package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    CarRepository repository;
    private static final String ERROR = "NO ID FOUND";
    @RequestMapping("/car/{id}")
    public Car findById(@PathVariable(value = "id")int id ){
        Car result;
        result = repository.findOne((long) id);
        if(result!=null){
            return result;
        }else {
            return new Car(id,ERROR,ERROR,ERROR,ERROR);
        }
    }
    @RequestMapping(value="/car",method= RequestMethod.POST)
    public ResponseEntity<String> createCar(@RequestBody Car i){
        repository.save(i);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @RequestMapping(value="car/{id}",method=RequestMethod.DELETE)
    public ResponseEntity deletebyId(@PathVariable(value = "id")int id ) {
        try {
            repository.delete((long) id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (EmptyResultDataAccessException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @RequestMapping(value="/car",method= RequestMethod.PUT)
    public ResponseEntity updateCar(@RequestBody Car i){
       repository.save(i);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();

    }
}

