package ifsuldeminas.pas.bcc.primeiroprojeto.controller;

import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Calendar;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @GetMapping("/today")
    public String today(){
        return "Hoje é " + LocalDate.now().getDayOfMonth()+"/"+ LocalDate.now().getMonthValue()+"/"+LocalDate.now().getYear();
    }

    @GetMapping("/tomorrow")
    public String tomorrow(){
        return "Amanhã será "+LocalDate.now().plusDays(1).getDayOfMonth()+"/"+ LocalDate.now().plusDays(1).getMonthValue()+"/"+LocalDate.now().plusDays(1).getYear();
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello! ";
    }
}
