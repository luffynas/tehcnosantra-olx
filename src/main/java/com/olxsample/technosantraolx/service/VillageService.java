package com.olxsample.technosantraolx.service;


import com.olxsample.technosantraolx.entity.Village;
import com.olxsample.technosantraolx.repository.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = false)
public class VillageService {

    @Autowired
    private VillageRepository repository;

    @Transactional(readOnly = true)
    public Optional<Village> find(Integer id){
        return repository.findById(id);
    }

    public void save(Village city){
        repository.save(city);
    }

    @Transactional(readOnly = true)
    public List<Village> findAll(){
        return repository.findAll();
    }
}
