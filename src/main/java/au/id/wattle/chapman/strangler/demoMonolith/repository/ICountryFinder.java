package au.id.wattle.chapman.strangler.demoMonolith.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import au.id.wattle.chapman.strangler.demoMonolith.model.entities.Country;

public interface ICountryFinder extends JpaRepository<Country, Long>{
    Country findByName(String name);
    Country findByCode(String code);
}
