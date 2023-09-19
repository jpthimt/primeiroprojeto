package ifsuldeminas.pas.bcc.primeiroprojeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

     @GetMapping("/ola")
    public String ola(){
        return "Olá Mundo!";
     }

    @GetMapping("/paia")
        public String paia(){
        return "paia";
    }


}
