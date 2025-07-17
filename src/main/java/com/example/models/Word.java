package com.example.models;

public class Word implements DocumentType{
    @Override
    public void upload(String file , Storage saveInto,Notification notification)
    {
        saveInto.save();
        System.out.println("Word Uploaded!!");
    }
}