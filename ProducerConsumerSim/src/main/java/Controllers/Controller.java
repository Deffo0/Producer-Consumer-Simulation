package Controllers;

import Model.ColorGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@CrossOrigin("http://localhost:4200")
public class Controller {



    @PostMapping("/play")
    void generateColor(){
        Network.play();
    }



}