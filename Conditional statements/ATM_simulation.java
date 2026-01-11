import java.util.*;
public class ATM_simulation {
public static void main(String args[]){
Scanner input = new Scanner(System.in);
double balance = 10000;
int choice;
do{
System.out.println("ATM MENU");
System.out.println("1.Deposit");
System.out.println("2.Balance");
System.out.println("3.Withdraw");
System.out.println("4.Exit");
System.out.println("Enter your choice:");
choice = input.nextInt();
switch(choice){
case 1:
System.out.print("Enter the amount to deposit:");
double deposit = input.nextDouble();
if(deposit>0){ 
balance = balance+deposit;
}
else{
System.out.print("Enter valid amount to deposit");
}
break;
case 2:
System.out.println("Current balance: "+balance);
break;

case 3:
System.out.print("Enter the amount to withdraw:");
double withdraw = input.nextDouble();
if(balance==0){
System.out.print("Your Balance Is Nil!");
}
else if(withdraw>balance){
System.out.print("Insufficient balance!");
}
else{
balance = balance-withdraw;
}
break;
case 4:
System.out.print("Exited!");
break;
default:System.out.println("Invalid choice!");

}

}while(choice!=4);
}
}