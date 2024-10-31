package au.id.wattle.chapman.strangler.demoMonolith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import au.id.wattle.chapman.strangler.demoMonolith.apis.CountriesApi;
import au.id.wattle.chapman.strangler.demoMonolith.mappers.CountryMapper;
import au.id.wattle.chapman.strangler.demoMonolith.model.entities.Country;

@Service("full")
public class FullConvertedCountryService implements ICountryService {

    @Autowired
    private CountriesApi api;
    
    @Autowired
    CountryMapper countryMapper;

    @Override
    public List<Country> getCountries() {
        return countryMapper.dtoListToEntityList(api.getCountries());
    }

    @Override
    public Country getCountry(String code) {
        return countryMapper.dtoToEntity(api.getCountry(code));
    }

    @Override
    public void saveCountry(Country country) {
        api.saveCountry(countryMapper.entityToDto(country));
    }

}
