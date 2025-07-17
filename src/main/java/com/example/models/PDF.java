package com.example.models;

public class PDF implements DocumentType{

    @Override
    public void upload(String file , Storage saveInto,Notification notification)
    {
        saveInto.save();
        notification.notifyUser();
        System.out.println("PDF Uploaded!!");
        
    }
}