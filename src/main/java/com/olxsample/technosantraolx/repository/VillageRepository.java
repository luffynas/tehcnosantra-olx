package com.olxsample.technosantraolx.repository;


import com.olxsample.technosantraolx.entity.Village;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VillageRepository extends CrudRepository<Village, Integer> {

    public List<Village> findAll();

}
