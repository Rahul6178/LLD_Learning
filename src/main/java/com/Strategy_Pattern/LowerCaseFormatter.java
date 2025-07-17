package com.Strategy_Pattern;

public class LowerCaseFormatter implements TextFormatter {

    @Override
    public String format(String input) {
       return input.toLowerCase();
    }

}
