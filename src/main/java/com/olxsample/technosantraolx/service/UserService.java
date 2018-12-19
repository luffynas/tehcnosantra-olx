package com.olxsample.technosantraolx.service;


import com.olxsample.technosantraolx.entity.User;
import com.olxsample.technosantraolx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = false)
public class UserService {

//    @Autowired
//    private UserRepository repository;

//    @Transactional(readOnly = true)
//    public Optional<User> find(Long id){
//        return repository.findById(id);
//    }
//
//    public void save(User user){
//        repository.save(user);
//    }
//
//    @Transactional(readOnly = true)
//    public List<User> findAll(){
//        return repository.findAll();
//    }
}
