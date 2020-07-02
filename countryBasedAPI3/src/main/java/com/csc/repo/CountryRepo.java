package com.csc.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csc.entity.Country;


@Repository("countryRepository")
public interface CountryRepo extends CrudRepository<Country, Integer> {
//	@Query("select new com.csc.entity.CountryEntity(country_id, countries) from Country where country.id = :id")
//	public List<Country> findAll();
}