class Account{
String AccHolderName;
double AccBalance;
int AccNumber;

Account(String name, double balance, int number){
AccHolderName = name;
AccBalance = balance;
AccNumber = number;
}

void deposit(double amount){
AccBalance = AccBalance + amount;
System.out.println("The total amount is: "+AccBalance);
}
void withdraw(double amount){
if(amount<AccBalance){
AccBalance = AccBalance-amount;
System.out.println("The amount withdrawn is: "+amount);
}
else{
System.out.println("Your balance is less than amount!! ");
}
}
void display(){
System.out.println("Account holder Nmae : "+AccHolderName);
System.out.println("Account Number : "+AccNumber);
System.out.println("Account balance : "+AccBalance);
}
}
class Saving_Acc extends Account{
double rate_of_intrest;

Saving_Acc(String name, double balance, int number, double roi){
super(name,balance,number);
rate_of_intrest=roi;
}

void calc(){
AccBalance = AccBalance+(AccBalance*(rate_of_intrest/100));
System.out.println("The total balance after intrest is: "+AccBalance);
}
}
class Bank_Demo{
public static void main(String[] args){
Saving_Acc obj = new Saving_Acc("Priya",200000,324578456,3);

obj.deposit(6000);
obj.withdraw(1000);
obj.display();
obj.calc();
}
}