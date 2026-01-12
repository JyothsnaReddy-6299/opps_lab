import java.util.*;

public class Electricity_Bill {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the total units consumed:");
int units = in.nextInt();
System.out.println("Are you a senior citizen (yes/no):");
String senior = in.next();
double cost = 0;
double taxedBill = 0;

if (units <= 100) {
cost = units * 1.5;
} 
else if (units <= 200) {
cost = units * 2.5;
} 
else {
cost = units * 3.5;
}
taxedBill = cost + (cost * 0.05);
if (senior.equalsIgnoreCase("yes")) {
System.out.println("You are eligible for 10% discount!");
taxedBill = taxedBill - (taxedBill * 0.10);
} 
else {
System.out.println("You are not eligible for 10% discount");
}
System.out.println("Your total bill is: " + taxedBill);
if (units > 500) {
System.out.println("High consumption");
}
}
}
