package sergek.Project.COVID19.Tracker.App.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sergek.Project.COVID19.Tracker.App.Service.PersonService;

import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping("/")
    public String getPeople(Model model){
        model.addAttribute("something", "Spring Boot + Thymeleaf My First Project");
        model.addAttribute("people", Arrays.asList(
                new PersonService("Zirek", 42),
                new PersonService("Belek", 39),
                new PersonService("Avaz", 35),
                new PersonService("Sergek", 33)
        ));
        return "people";

    }


}
