package com.example.demo2.service;


import com.example.demo2.model.greetings;
import com.example.demo2.repository.greetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class greetingService {

    @Autowired

    private greetingRepository greetrepo;
    static private ArrayList<greetings> great= new ArrayList<greetings>(Arrays.asList(

            new greetings(23,"stream"),
            new greetings(24,"stream"),
            new greetings(25,"stream")

    ));
    public List<greetings> getGreet(){
        List<greetings> greetList=new ArrayList<>();
        greetrepo.findAll().forEach(greetings -> {
            greetList.add(greetings);
        });
        return greetList;
    }
    public greetings getgreets(Integer id){
        return greetrepo.findById(id).orElse(null);
    }
      public void deletegreeting(int id){

        greetrepo.deleteById(id);
      }
      public void addgreeting(greetings greet){

       greetrepo.save(greet);
      }
      public void updategreeting(greetings greet, int id){
       greetrepo.save(greet);
      }
}
