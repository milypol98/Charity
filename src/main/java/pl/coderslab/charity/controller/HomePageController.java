package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

@Controller
public class HomePageController {
    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;

    public HomePageController(InstitutionRepository institutionRepository, DonationRepository donationRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String HomeShowInstytution(Model model) {
        model.addAttribute("instytution", institutionRepository.fourElements());
        model.addAttribute("donation",donationRepository.allDonations());
        model.addAttribute("quantity" , donationRepository.allQuantity());
        return "index";
    }

}
