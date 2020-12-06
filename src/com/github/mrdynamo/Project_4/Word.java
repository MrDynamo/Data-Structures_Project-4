package com.github.mrdynamo.Project_4;

public class Word extends KeyedItem<String> {

    //private String key;
    private int count;

    public Word(String key, Integer count) {
        super(key);
        //this.key = key;
        this.count = count;
    }

}
