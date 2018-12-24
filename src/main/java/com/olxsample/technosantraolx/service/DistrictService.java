package com.olxsample.technosantraolx.service;


import com.olxsample.technosantraolx.entity.Country;
import com.olxsample.technosantraolx.entity.District;
import com.olxsample.technosantraolx.repository.CountryRepository;
import com.olxsample.technosantraolx.repository.DisctrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = false)
public class DistrictService {

    @Autowired
    private DisctrictRepository repository;

    @Transactional(readOnly = true)
    public Optional<District> find(Integer id){
        return repository.findById(id);
    }

    public void save(District city){
        repository.save(city);
    }

    @Transactional(readOnly = true)
    public List<District> findAll(){
        return repository.findAll();
    }
}
