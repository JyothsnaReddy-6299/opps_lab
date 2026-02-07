class MobileAccount{
String Customer_Name;
long PhoneNumber;
double Balance;

MobileAccount(String name, long number, double balance){
Customer_Name = name;
PhoneNumber = number;
Balance = balance;
}
void Recharge(double amount){
Balance = Balance+amount;
System.out.println("The total balance available is "+Balance);
}
void makecall(double cost){
if( cost>=0 && cost<=Balance){
Balance = Balance - cost;
System.out.println("Amount deducted for call: "+cost);
}
else{
System.out.println("Invalid or You have a low balance!!");
}
}
void display(){
System.out.println("Customer name: "+Customer_Name);
System.out.println("Phone number: "+PhoneNumber);
System.out.println("Balance: "+Balance);
}
}
class Limit extends MobileAccount{
double MobileLimit;

Limit(String name, long number, double balance, double M_limit){
super(name,number,balance);
MobileLimit = M_limit;
}
void calcBill(){
if( Balance >=0 && Balance<MobileLimit){
System.out.println("Your bill is in monthly limit");
}
else{
System.out.println("Your monthly bill exceeded!");
}
}
}
class Prepaid{
public static void main(String []args){
Limit obj = new Limit("Priya",9988776655L,500,700);
obj.Recharge(200);
obj.makecall(1.5);
obj.display();
obj.calcBill();
}
}













