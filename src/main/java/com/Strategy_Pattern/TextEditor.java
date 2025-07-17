package com.Strategy_Pattern;

public class TextEditor {
    private TextFormatter tf;

    public TextEditor(TextFormatter tf)
    {
        this.tf = tf;
    }

    public String format(String input)
    {
        return tf.format(input);
    }

}
