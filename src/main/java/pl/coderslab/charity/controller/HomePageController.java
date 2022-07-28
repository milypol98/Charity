package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

@Controller
public class HomePageController {
    private final InstitutionRepository institutionRepository;

    public HomePageController(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String Home(Model model) {
        model.addAttribute("instytution", institutionRepository.fourElements());
        return "index";
    }
}
