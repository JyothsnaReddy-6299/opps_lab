import java.util.*;
public class Password_check {
public static void main(String args[]){
Scanner input = new Scanner(System.in);
String password = input.nextLine();

boolean hasUpper = false;
boolean hasLower = false;
boolean hasSpecial = false;
boolean hasDigit = false;

for(int i=0; i<password.length(); i++){
char ch = password.charAt(i);
    
if(ch>='a'&& ch<='z'){
hasLower= true;
}
else if(ch>='A'&& ch<='Z'){
hasUpper = true;
}
else if(ch>='0'&& ch<='9'){
hasDigit = true;
}
else {
hasSpecial = true;
}
}
if(hasLower && hasUpper&& hasDigit &&hasSpecial ){
System.out.println("This is a valid password.");
}
else{
System.out.println("This password is not valid.");

if (!hasUpper) System.out.println("- Missing uppercase letter");
if (!hasLower) System.out.println("- Missing lowercase letter");
if (!hasDigit) System.out.println("- Missing digit");
if (!hasSpecial) System.out.println("- Missing special character");
    
}
}
}
