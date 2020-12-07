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
    }

    @Override
    public boolean equals(Object o) {
        return this.toString().equals(o.toString());
    }

    @Override
    public String toString() {
        return this.getKey().toUpperCase();
    }

    public int getCount() {
        return this.count;
    }

    public void addCount(int i) {
        this.count = count + i;
    }

}
