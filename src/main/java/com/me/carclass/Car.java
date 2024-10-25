package com.me.carclass;

public class Car {
    private String make;
    private String model;   //change to private
    private String color;   // change to private
    private String status = "stopped";
    private int speed = 0; // added
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getMake() {
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }


    public String getStatus() {
        return this.status;
    }
    public void start() {
        System.out.println("Starting the car...");
        this.status = "started";
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

//This will add the accelerate() and brake() methods to the Car class, which modify the speed attribute as specified take NO param  -=10,  +=20
    public void accelerate() {
        this.speed += 20;
    }


public void brake() {
        this.speed -= 10;
    }


    public void stop() {
        System.out.println("Stopping the car...");
        status = "stopped";
    }
    
    public void honk() {
        System.out.println("honk honk~~~");
    }
 
}
