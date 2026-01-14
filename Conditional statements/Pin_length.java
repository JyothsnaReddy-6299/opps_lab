 import java.util.*;

public class Pin_length {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
String pin;
boolean valid;
do {
System.out.print("Enter the pin: ");
pin = input.nextLine();
valid = true;  

if(pin.length() != 4) {
System.out.println("Invalid PIN. PIN must contain exactly 4 digits.");
valid = false;
} else {
for(int i = 0; i < pin.length(); i++) {
char c = pin.charAt(i);
if(c < '0' || c > '9') {
System.out.println("Invalid PIN. PIN must contain only digits.");
valid = false;
break;
}
}
}

} while(!valid);  

System.out.println("This PIN is valid.");
}
}
