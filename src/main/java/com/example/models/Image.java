package com.example.models;

public class Image implements DocumentType{
    @Override
    public void upload(String file , Storage saveInto,Notification notification)
    {
        saveInto.save();
        System.out.println("Image Uploaded!!");
    }
}