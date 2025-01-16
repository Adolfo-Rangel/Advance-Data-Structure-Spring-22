package com.codewithadolfo;

public class Robot {
    String name;
    String color;
    int weight;
    Robot lookingAt;


    public Robot(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    void introduceSelf(){
        System.out.println("Hello my name is: " + this.name);
    }
}
