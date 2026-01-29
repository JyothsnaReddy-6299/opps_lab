import java.util.*;
public class Jump_Statements {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while (true) {

System.out.print("Enter a number: ");
int n = sc.nextInt();

if (n > 100) {
System.out.println("Number greater than 100. Program terminated.");
return;
}
if (n == 0) {
System.out.println("Zero entered. Loop stopped.");
break;
}

if (n % 2 == 0) {
System.out.println("Even number skipped.");
continue;
}
System.out.println("Valid odd number: " + n);
}
System.out.println("Program ended normally.");
}
}
