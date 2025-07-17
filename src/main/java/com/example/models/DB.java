package com.example.models;

public class DB implements Storage{
    
    @Override 
    public void save()
    {
        System.out.println("Saving in DB...");
    }
}