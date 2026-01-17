import java.util.*;
public class Password_lock{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
String crt_password = "LocK#321";
int count = 3;

for(int i=1; i<=3;i++){
System.out.println("Enter your password:");
String password = in.nextLine();	

if(crt_password.equals(password)){
System.out.println("Login Successful!");
break;
}
else{
count--;
System.out.println("Your password is incorrect.Chances left are: "+count);
}
}
} 
}