import java.util.*;
public class Inch_meter {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    Float inches = input.nextFloat();
    double meter = inches*0.0254;
    System.out.println("the distance in meters is: "+meter);  
    }
}