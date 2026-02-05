class Bank {
String AccNo;
Double Balance;

void getDetails(String A, double B){
AccNo = A;
Balance = B;
}
}
class  SavingAcc extends Bank{
double Interest;

void getIntrest_Rate(double I){
Interest = I;
}
}
class Amount extends SavingAcc{
void calculate(){
System.out.println("The amount in your account before interest is: "+Balance);
Balance =Balance+(Balance*(Interest/100));
System.out.println("Your Account Number is: "+AccNo);
System.out.println("Current Rate of Interest is: "+Interest);
System.out.println("The Total amount now your account is: "+Balance);
}

public static void main(String[] args){
Amount obj = new Amount();
obj.getDetails("34526182", 24000);
obj.getIntrest_Rate(3.7);
obj.calculate();
}
}