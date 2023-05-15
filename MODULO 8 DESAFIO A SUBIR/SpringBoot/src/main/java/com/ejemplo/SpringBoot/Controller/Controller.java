
package com.ejemplo.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class Controller {
    
    @GetMapping
    public String decirHola() {
        return "Hola mundo";
    }
    
    
}
