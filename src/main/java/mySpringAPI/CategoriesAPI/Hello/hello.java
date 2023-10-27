package mySpringAPI.CategoriesAPI.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @RequestMapping("/hello")
    public String hi(){
        return "Sat Sri Akal! Hello!";
    }
}
