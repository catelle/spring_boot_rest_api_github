package com.example.demo2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class greetings {

    @Id
    private int id;
    private String content;

    public greetings(){

    }
    public greetings(int id, String content){
        super();
        this.id=id;
        this.content=content;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}



