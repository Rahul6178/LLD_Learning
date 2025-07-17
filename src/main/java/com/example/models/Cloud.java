package com.example.models;

public class Cloud implements Storage{
    
    @Override 
    public void save()
    {
        System.out.println("Saving in Cloud...");
    }
}