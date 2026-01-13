import java.util.*;
public class Shopping_Bill{
public static void main(String args[]){

Scanner in = new Scanner(System.in);
System.out.println("Enter your shopping bill:");
int bill = in.nextInt();
String LD_code ="563s7839ur";
double tbill = bill+(bill*0.05);
System.out.println("Your Total Bill is :"+tbill);

if(tbill>5000){
System.out.println("You are eligible for 15% discount on your bill!!!");
double tcill = tbill-(tbill*0.15);
System.out.println("Final bill is :"+tcill);
}
else if(tbill<500){
System.out.println("Extra delivery charge of Rs.50");
tbill =tbill+50;
System.out.println("Final bill is :"+tbill);

}
 else if(tbill>=1000){
System.out.println("Your Are Eligible for Free Delivery.");
System.out.println("Final bill is :"+tbill);

}
System.out.println("If you have a LuckyDraw code Enter here:");
String code = in.next();
if(code.equals(LD_code)){
System.out.println("CONGRATULATIONS!! You won flat Rs.1000 off on your next purchase");
}
else{
System.out.println("Your code is not eligible");

}

}
}
