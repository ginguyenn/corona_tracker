package ha6.controllers;

import ha6.services.CoronaVirusDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStates", CoronaVirusDataService.getAllStates());
        return "home";
    }
}
