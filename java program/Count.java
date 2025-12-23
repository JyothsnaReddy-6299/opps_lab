import java.util.*;
public class Count
{
public static void main(String args[])
{
int Count_Positive = 0;
int Count_Negative = 0;
int Count_Zero = 0;
Scanner sc = new Scanner(System.in);
Scanner input = new Scanner(System.in);
int N = sc.nextInt();
for(int i=1; i<=N; i++){
System.out.println("Enter the number" +i+":");
int num = input.nextInt();
if(num>0){
Count_Positive++;
}
else if(num<0){
Count_Negative++;
}
else{
Count_Zero++;
}
}
System.out.println("The count of positive numbers is " + Count_Positive);
System.out.println("The count of Negative numbers is " + Count_Negative);
System.out.println("The count of Zero numbers is " + Count_Zero);
}
}

