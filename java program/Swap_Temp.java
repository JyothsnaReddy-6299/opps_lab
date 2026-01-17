import java.util.*;
public class Swap_Temp {
public static void main(String args[]){
Scanner num  = new Scanner(System.in);
System.out.println("Enter a");
int a = num.nextInt();
System.out.println("Enter b");
int b = num.nextInt();
int temp = a;
a = b;
b =temp;
System.out.println("The swapped numbers are:");
System.out.println(a+"and"+b);
}  
}
