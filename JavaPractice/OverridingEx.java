package JavaPractice;

class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}
class Bike extends Vehicle{

    public void start(){
        System.out.println("Bike starts with kick");
    }
}

class Car extends Vehicle{

    public void start(){
        System.out.println("Car starts with key");
    }
}

public class OverridingEx {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        Vehicle v1 = new Car();
        v1.start();
        Vehicle v2 = new Vehicle();
        v2.start();
    }
}
