package com.example.intents;

public class Singleton {
    static private Singleton instance = new Singleton();
    private Singleton(){

    }
    static public Singleton getInstance(){
        return instance;
    }
    public String text = "";
}
