package com.olxsample.technosantraolx.repository;


import com.olxsample.technosantraolx.entity.Province;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProvinceRepository extends CrudRepository<Province, Integer> {

    public List<Province> findAll();

}
