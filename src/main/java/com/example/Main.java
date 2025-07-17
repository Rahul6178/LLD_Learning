package com.example;

import com.Strategy_Pattern.LowerCaseFormatter;
import com.Strategy_Pattern.TextEditor;
import com.Strategy_Pattern.UpperCaseFormatter;
import com.example.models.DocumentUploader;

/**
 * Main class for the Java project
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to your Java project!");
       TextEditor teLowerCase = new TextEditor(new LowerCaseFormatter());
        System.out.println(teLowerCase.format("Guruji is wise"));
       TextEditor teUpperCase = new TextEditor(new UpperCaseFormatter());
        System.out.println(teUpperCase.format("Guruji is wise"));
    }
}
