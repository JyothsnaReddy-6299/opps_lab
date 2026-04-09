interface Payment{
void pay(double amount);
}
class CreditCard implements Payment{
public void pay(double amount){System.out.println("Paid using Credit Card: "+amount);}
}
class DebitCard implements Payment{
public void pay(double amount){System.out.println("Paid using Debit Card: "+amount);}
}
class UPI implements Payment{
public void pay(double amount){System.out.println("Paid using UPI: "+amount);}
}
class Test{
public static void main(String[] args){
Payment p;
p=new CreditCard();
p.pay(1000);
p=new DebitCard();
p.pay(500);
p=new UPI();
p.pay(200);
}
}