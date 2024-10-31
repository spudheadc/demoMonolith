package au.id.wattle.chapman.strangler.demoMonolith.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import au.id.wattle.chapman.strangler.demoMonolith.model.entities.Country;
import au.id.wattle.chapman.strangler.demoMonolith.service.ICountryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {

    @Autowired
    @Qualifier("original")
    private ICountryService service;
    
    @GetMapping (value = "/")
    public List<Country> getCountries() {
        return service.getCountries();
    }
    
    @GetMapping (value = "/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountry(code);
    }

    @PostMapping("/")
    public void saveCountry(@RequestBody Country entity) {
        service.saveCountry(entity);
    }
    
}
