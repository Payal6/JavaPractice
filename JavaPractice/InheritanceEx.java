package JavaPractice;
 
/* Single Level Inheritance
class Vehicle{
  void start1(){
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle{
    void ride(){
        System.out.println("Bike is riding");
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start1();
        b.ride();
    }
}
*/

/* Multilevel Inheritance

class Device{
    void powerOn(){
        System.out.println("Device power On");
    }
}

class Phone extends Device{
    void calling(){
        System.out.println("Calling from phone");
    }
}

class Smartphone extends Phone{
    void photos(){
        System.out.println("Taking photos from Smartphone");
    }
}
 public class InheritanceEx{
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();

        sp.powerOn();
        sp.calling();
        sp.photos();
    }
 }
*/

/* hierarchical inheritance */

class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle{
    void ride(){
        System.out.println("Bike is riding");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Car is driving");
    }
}

public class InheritanceEx {

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.ride();

        Car c = new Car();
        c.start();
        c.drive();
    }
     
}