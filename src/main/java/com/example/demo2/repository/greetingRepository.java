package com.example.demo2.repository;

import com.example.demo2.model.greetings;
import org.springframework.data.repository.CrudRepository;

public interface greetingRepository extends CrudRepository<greetings, Integer>{

}
