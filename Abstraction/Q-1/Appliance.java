abstract class Appliance{
abstract void turnOn();
}

class WashingMachine extends Appliance{
void turnOn(){System.out.println("Washing Machine On");}
}

class Refrigerator extends Appliance{
void turnOn(){System.out.println("Refrigerator On");}
}

class Test{
public static void main(String[] args){
Appliance a=new WashingMachine();
a.turnOn();
}
}