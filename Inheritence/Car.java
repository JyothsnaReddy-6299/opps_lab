class Vehicle{
String car;

void getCarName(String C){
car =C;
}
}
class Brand extends Vehicle{
String brand;

void getBrand(String B){
brand = B;
}
}
class Type extends Brand{
String type;

void getType(String T){
type = T;
System.out.println("Your car name is:"+car);
System.out.println("The brand name is:"+brand);
System.out.println("The type of your car is:"+type);
}
public static void main(String []args){
Type obj = new Type();
obj.getCarName("Creta");
obj.getBrand("Hyundai");
obj.getType("Petrol");
}
}