package com.olxsample.technosantraolx.repository;


import com.olxsample.technosantraolx.entity.District;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DisctrictRepository extends CrudRepository<District, Integer> {

    public List<District> findAll();

}
