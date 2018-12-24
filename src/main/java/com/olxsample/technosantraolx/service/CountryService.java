package com.olxsample.technosantraolx.service;


import com.olxsample.technosantraolx.entity.City;
import com.olxsample.technosantraolx.entity.Country;
import com.olxsample.technosantraolx.repository.CityRepository;
import com.olxsample.technosantraolx.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = false)
public class CountryService {

    @Autowired
    private CountryRepository repository;

    @Transactional(readOnly = true)
    public Optional<Country> find(Integer id){
        return repository.findById(id);
    }

    public void save(Country city){
        repository.save(city);
    }

    @Transactional(readOnly = true)
    public List<Country> findAll(){
        return repository.findAll();
    }
}
