package com.Strategy_Pattern;

public class UpperCaseFormatter implements TextFormatter{

    @Override
    public String format(String input) {
      return input.toUpperCase();
    }

}
