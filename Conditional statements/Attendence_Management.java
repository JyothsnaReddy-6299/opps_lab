import java.util.*;
public  class Attendence_Management{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("Enter Total number of days:");
int TotalDays = in.nextInt();
System.out.println("Enter number of days present:");
int PresentDays = in.nextInt();
System.out.println("Do you have a medical certifiacte(yes/no):");
String med_cert = in.next();

double percentage = ((double)PresentDays / TotalDays)*100;
System.out.println("Your attendence percentage is :"+percentage);

if(percentage>75){
System.out.println("Your are eligible for exams!");
}
else if(percentage >=65&& med_cert.equalsIgnoreCase("yes")){
System.out.println("Your are eligible for grace marks!");
}
else{
System.out.println("Your are not eligible.");

}
}
}