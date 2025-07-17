package com.example.models;

public class FileSystem implements Storage{
    
    @Override 
    public void save()
    {
        System.out.println("Saving in FS...");
    }
}