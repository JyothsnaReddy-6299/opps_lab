class BankAccount{
private double balance;

void deposit(double amt){
balance+=amt;
}
void withdraw(double amt){
if(amt<=balance)balance-=amt;
}
double getBalance(){
return balance;
}
public static void main(String[] args){
BankAccount b=new BankAccount();
b.deposit(1000);
b.withdraw(400);
System.out.println(b.getBalance());
}
}