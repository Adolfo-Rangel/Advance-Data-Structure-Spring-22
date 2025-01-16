package com.codewithadolfo;

public class Main {

    public static void main(String[] args) {

        Robot r1 = new Robot("Tom", "Red", 30);
        Robot r2 = new Robot("Jerry", "Blue", 40);

        Person p1 = new Person("Alice", "Aggresive", false);
        Person p2 = new Person("Jacob", "talkative", true);

        p1.robotOwned = r2;
        p2.robotOwned = r1;

        r1.lookingAt = r2;
        r2.lookingAt = r1;

        p1.robotOwned.introduceSelf();
        p2.robotOwned.introduceSelf();




        /*
        r1.introduceSelf();
        r2.introduceSelf();
         */


    }
}
