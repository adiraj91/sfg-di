package Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String ControllerMethod(){
        System.out.println("hello World");
        return " Returning ControllerMethod";
    }

}
