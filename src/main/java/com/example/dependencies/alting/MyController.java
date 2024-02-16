package com.example.dependencies.alting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Controller
public class MyController {
private final Service service = new Service();

    @GetMapping("hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Tine");
        return "greeting";
    }

    @GetMapping("day")
    public String todays(Model model){
        LocalDate date = LocalDate.now();
        model.addAttribute("date", date);
        return "today";
    }

    @GetMapping("friday")
    public String todaysDate(Model model) {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        model.addAttribute("day", day);
        return "friday";
    }

    @GetMapping("findAll")
    public String findAllAges(Model model) {
    List<Person> people = service.getPeople();
        model.addAttribute("list", people );
                return "alcohol";
    }


}
