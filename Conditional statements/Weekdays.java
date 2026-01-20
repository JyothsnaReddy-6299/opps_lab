import java.util.*; 
public class Weekdays{ 
public static void main(String args[]){ 
Scanner in = new Scanner(System.in); 
System.out.println("Enter the number:"); 
int day = in.nextInt(); 
System.out.println(getdayname(day)); 
} 
public static String getdayname(int day){ 
String dayname = ""; 

switch(day){ 

case 1: dayname = "Sunday";break; 
case 2: dayname = "Monday";break; 
case 3: dayname = "Tuesday";break; 
case 4: dayname = "Wednesday";break; 
case 5: dayname = "Thrusday";break; 
case 6: dayname = "Friday";break; 
case 7: dayname = "Saturday";break; 
} 
return dayname; 
} 
} 