import java.util.*; 
public class Calculator{  
public static void main(String args[]) 
{  
Scanner in = new Scanner(System.in);  
System.out.println("Enter your required operation:"); 
char op = in.next().charAt(0);
System.out.println("Enter a:");
int a = in.nextInt();
System.out.println("Enter b:");
int b = in.nextInt(); 

switch(op)
{
case '+': System.out.println("The sum is:"+(a+b));
break;
case '-': System.out.println("The difference is:"+(a-b));
break;
case '*': System.out.println("The product is:"+(a*b));
break;
case '/':
 if (b!=0){
 System.out.println("The quotient is:"+(a/b));break;
 } 
else{ System.out.println("Invalid division with zero");break;
 }
 }
 }
 }