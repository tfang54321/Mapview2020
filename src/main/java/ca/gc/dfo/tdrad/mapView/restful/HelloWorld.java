package ca.gc.dfo.tdrad.mapView.restful;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/hello")
public class HelloWorld {


  //  @GetMapping("/hello11")
    public String sayHello(@RequestParam(value="name") String name){

        return "hello1"+ name+"!";
    }

  //  @GetMapping("/hello22")
    public String sayHello2(@RequestParam(value="name") String name){

        return "hello2"+ name+"!";
    }
}
