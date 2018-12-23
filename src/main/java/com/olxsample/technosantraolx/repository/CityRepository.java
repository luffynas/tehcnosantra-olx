package com.olxsample.technosantraolx.repository;


import com.olxsample.technosantraolx.entity.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long> {

    public List<City> findAll();

}
