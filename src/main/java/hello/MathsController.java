package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class MathsController {

    @RequestMapping("/maths")
    public Maths maths(@RequestParam(value="number") int number) {
        return new Maths(number*2,2);
    }
}
