package com.example.models;

public class DocumentUploader {


   public void docUpload(DocumentType dt, String file,Notification notification,Storage store)
    {
        dt.upload(file,store,notification);
    }

}