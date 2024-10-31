package au.id.wattle.chapman.strangler.demoMonolith.service;

import java.util.List;

import au.id.wattle.chapman.strangler.demoMonolith.model.entities.Country;

public interface ICountryService {

    List<Country> getCountries();

    Country getCountry(String code);

    void saveCountry(Country country);

}