package com.codewithadolfo;

public class Main {

    public static void main(String[] args) {
	// polymorphism = greek word for poly - "many", morph - "form"
        // the ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat}; //we notice that car, bicycle and boat are extended from vehicle
        //because all of these objects identify as vehicles, for an array

        /*
        car.go();
        bicycle.go();
        boat.go();
        instead of this we can do this
        */
        for(Vehicle x: racers) { //x represents the vehicles we are currently working with
            x.go();
        }
    }
}
