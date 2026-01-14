import java.util.*;
public class Discount{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Are you a member (Yes/No):");
String mem = in.nextLine();
System.out.println("Enter your purchase amount:");
int amt = in.nextInt();

if(mem.equalsIgnoreCase("yes")&&amt>=1000){
System.out.println("Your are eligible for 10% discount!!");
double dis = amt-(amt*0.1);
System.out.println("Final billed amount: "+dis);
}
else{
System.out.println("Your are not eligible for discount");
}
}

}