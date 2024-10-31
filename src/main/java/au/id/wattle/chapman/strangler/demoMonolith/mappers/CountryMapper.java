package au.id.wattle.chapman.strangler.demoMonolith.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import au.id.wattle.chapman.strangler.demoMonolith.model.entities.Country;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    Country dtoToEntity(au.id.wattle.chapman.strangler.demoMonolith.models.Country source);
    List<Country> dtoListToEntityList(List<au.id.wattle.chapman.strangler.demoMonolith.models.Country> source);
    au.id.wattle.chapman.strangler.demoMonolith.models.Country entityToDto(Country source);

}
