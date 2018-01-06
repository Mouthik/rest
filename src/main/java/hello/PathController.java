package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @RequestMapping("/path/{path}")

        public TestPath testpath(@PathVariable(value="path")String path){

        return new TestPath(path);
    }

}
