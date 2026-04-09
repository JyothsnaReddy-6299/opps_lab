abstract class Vehicle{
abstract void start();
abstract void fuelType();
}
class Car extends Vehicle{
void start(){System.out.println("Car Start");}
void fuelType(){System.out.println("Petrol");}
}
class ElectricBike extends Vehicle{
void start(){System.out.println("Bike Start");}
void fuelType(){System.out.println("Electric");}
}
class Test{
public static void main(String[] args){
Vehicle v;
v=new Car();
v.start();
v.fuelType();
v=new ElectricBike();
v.start();
v.fuelType();
}
}