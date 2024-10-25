package com.me.carclass;

public class CarClass {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar = new Car();
     
        myCar.setColor("red"); // This will set the color attribute of myCar to "red";
        myCar.setMake("Honda");
        myCar.setModel("Civic"); // This will set the model attribute of myCar to "Civic";
        


        System.out.println(myCar.getColor());
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        

        System.out.println(myCar.getStatus());
        System.out.println(myCar.getSpeed());
       
       
        myCar.start();
        
                
        System.out.printf("Status: %s%n", myCar.getStatus());
        System.out.printf("Speed: %d%n", myCar.getSpeed());
        

       myCar.accelerate();
       System.out.printf("Speed after acceleration: %d%n", myCar.getSpeed());

       //brake twice
       myCar.brake();
       myCar.brake();
       System.out.printf("Speed after braking 2 times: %d%n", myCar.getSpeed());


      // stop the car
       myCar.stop();
       System.out.printf("Status after stopping: %s%n", myCar.getStatus());
       System.out.printf("Speed after stopping: %d%n", myCar.getSpeed());

        // Honk
        myCar.honk();


        Car davidsCar = new Car();
        davidsCar.setColor("black");
        davidsCar.setMake("Benz");
        davidsCar.setModel("GLA");
        System.out.println("------------------");
       
        System.out.println("David's " + davidsCar.getStatus());
        System.out.println(davidsCar.getColor());
        System.out.println(davidsCar.getMake());
        System.out.println(davidsCar.getModel());
        
    }
}
 
