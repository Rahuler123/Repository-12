package com.csc.services;
import java.util.List;

import com.csc.entity.Country;
import com.csc.entity.CountryEntity;


public interface CountryService {

    public Iterable<Country> findAll();

    public Country find(int id);
    
    
    
    

}