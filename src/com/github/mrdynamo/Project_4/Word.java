package com.github.mrdynamo.Project_4;

public class Word extends KeyedItem<String> implements Comparable<Word> {

    //private String key;
    private int count;

    public Word(String key) {
        super(key.toUpperCase());
        this.count = 0;
    }

    public Word(String key, Integer count) {
        super(key.toUpperCase());
        //this.key = key;
        this.count = count;
    }

    @Override
    public int compareTo(Word o) {
        return this.getKey().toUpperCase().compareTo(o.getKey().toUpperCase());
        /*
        if (this.getKey() > o.getKey())
            return -1;
        else if (this.getKey().equals(o.getKey()))
            return 0;
        else if (this.getKey() > o.getKey())
            return 1;

         */
    }

    public int getCount() {
        return this.count;
    }
}
