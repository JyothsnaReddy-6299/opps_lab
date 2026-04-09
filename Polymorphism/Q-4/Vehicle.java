class Vehicle{
void move(){System.out.println("Vehicle is moving");}
}
class Car extends Vehicle{
void move(){System.out.println("Car is moving");}
}
class Test{
public static void main(String[] args){
Vehicle v;
v=new Vehicle();
v.move();
v=new Car();
v.move();
}
}