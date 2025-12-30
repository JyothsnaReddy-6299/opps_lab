import java.util.*;
public class Data_Types {
 public static void main(String []args){
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the student roll number:");
 int roll_no = input.nextInt();
 System.out.println("Enter student name:");
 String Name = input.next();
 System.out.println("Enter the section:");
 char section = input.next().charAt(0);
 System.out.println("Enter college code:");
 byte code = input.nextByte();
 System.out.println("Enter student percentage:");
 Float percentage = input.nextFloat();
 System.out.println("Enter the students average:");
 double average = input.nextDouble(); 
}
}