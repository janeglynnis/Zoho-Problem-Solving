package package1;

public class Vehicle {
    protected void start() {
        System.out.println("Vehicle Started");
    }
}
package package2;
import package1.Vehicle;

public class Bike extends Vehicle {
    public void test() {
        start(); // Accessible because Bike extends Vehicle
    }
}
