package au.id.wattle.chapman.strangler.demoMonolith.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import au.id.wattle.chapman.strangler.demoMonolith.service.ICountryService;

@Controller
public class MvcController {


    @Autowired
    @Qualifier("half")
    private ICountryService halfConverted;

    @Autowired
    @Qualifier("full")
    private ICountryService fullConverted;

    @Autowired
    @Qualifier("original")
    private ICountryService original;
    
    @GetMapping("/countries-original.html")
    public String getHomeOriginal(Model model) {
       
        model.addAttribute("countries", original.getCountries());

        return "countries.html";
    }
    
    @GetMapping("/countries-half.html")
    public String getHomeHalf(Model model) {
       
        model.addAttribute("countries", halfConverted.getCountries());

        return "countries.html";
    }
    
    @GetMapping("/countries-full.html")
    public String getHomeFull(Model model) {
       
        model.addAttribute("countries", fullConverted.getCountries());

        return "countries.html";
    }

}
