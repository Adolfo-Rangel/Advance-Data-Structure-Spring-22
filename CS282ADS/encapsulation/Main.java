package com.codewithadolfo;

public class Main {

    public static void main(String[] args) {

        //in this program we used the setter and getter methods to either update the informatin given to us
        // in the different classes or just use the private  methods used in class Car
        // this adds a layer of security so no other program can have access to these variables
        // it does add a lot more security but more coding is involved

        //Encapsulation = attributes of a class will be hidden or private,
        // can be accessed only through methods (getters and setters)
        // you should make attributes private if you don't have a reason to make them public / protected

        Car car1 = new Car("Chevrolet", "Camaro", 2022);
        Car car2 = new Car("Ford", "Mustang", 2022);

        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getYear());
        System.out.println(car1.getModel());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getYear());
        System.out.println(car2.getModel());

    }


}
