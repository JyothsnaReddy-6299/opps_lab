import java.util.*;
public class Average
{
public static void main(String args[])
{
Scanner num = new Scanner(System.in);
System.out.println("Enter the first number: ");
int a = num.nextInt();
System.out.println("Enter the second number: ");
int b = num.nextInt();
System.out.println("Enter the third number: ");
int c = num.nextInt();
int avg = (a+b+c)/3;
System.out.println("Average is: "+avg);
}
}
