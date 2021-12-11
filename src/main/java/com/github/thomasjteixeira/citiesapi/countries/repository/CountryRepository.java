package com.github.thomasjteixeira.citiesapi.countries.repository;

import com.github.thomasjteixeira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
