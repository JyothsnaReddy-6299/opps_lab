interface Vehicle{
void start();
void stop();
}
class Car implements Vehicle{
public void start(){System.out.println("Car Start");}
public void stop(){System.out.println("Car Stop");}
}
class Bike implements Vehicle{
public void start(){System.out.println("Bike Start");}
public void stop(){System.out.println("Bike Stop");}
}
class Test{
public static void main(String[] args){
Vehicle v;
v=new Car();
v.start();
v.stop();
v=new Bike();
v.start();
v.stop();
}
}