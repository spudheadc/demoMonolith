package au.id.wattle.chapman.strangler.demoMonolith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.id.wattle.chapman.strangler.demoMonolith.model.entities.Country;
import au.id.wattle.chapman.strangler.demoMonolith.repository.ICountryFinder;

@Service("original")
public class CountryService implements ICountryService {
    @Autowired
    private ICountryFinder finder;

    @Override
    public List<Country> getCountries() {
        return finder.findAll();
    }

    @Override
    public Country getCountry(String code) {
        return finder.findByCode(code);
    }

    @Override
    public void saveCountry(Country country)
    {
        finder.save(country);
    }

}
