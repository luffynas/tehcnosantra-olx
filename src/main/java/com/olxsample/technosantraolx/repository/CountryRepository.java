package com.olxsample.technosantraolx.repository;


import com.olxsample.technosantraolx.entity.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Integer> {

    public List<Country> findAll();

}
