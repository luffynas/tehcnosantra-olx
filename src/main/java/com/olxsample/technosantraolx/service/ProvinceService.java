package com.olxsample.technosantraolx.service;


import com.olxsample.technosantraolx.entity.Country;
import com.olxsample.technosantraolx.entity.Province;
import com.olxsample.technosantraolx.repository.CountryRepository;
import com.olxsample.technosantraolx.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = false)
public class ProvinceService {

    @Autowired
    private ProvinceRepository repository;

    @Transactional(readOnly = true)
    public Optional<Province> find(Integer id){
        return repository.findById(id);
    }

    public void save(Province city){
        repository.save(city);
    }

    @Transactional(readOnly = true)
    public List<Province> findAll(){
        return repository.findAll();
    }
}
