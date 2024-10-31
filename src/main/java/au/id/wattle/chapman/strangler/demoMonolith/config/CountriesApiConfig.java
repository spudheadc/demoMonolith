package au.id.wattle.chapman.strangler.demoMonolith.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import au.id.wattle.chapman.strangler.demoMonolith.ApiClient;
import au.id.wattle.chapman.strangler.demoMonolith.apis.CountriesApi;

@Configuration
public class CountriesApiConfig {

    @Bean
    public CountriesApi countriesApi() {
        return new CountriesApi(apiClient());
    }
    
    @Bean
    public ApiClient apiClient() {
        return new ApiClient();
    }

}
