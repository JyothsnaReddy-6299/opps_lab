package banking;

public class Account {
    private void privateMethod() {
 System.out.println("Private");
 }
protected void protectedMethod() {
 System.out.println("Protected");
 }
public void publicMethod() { 
System.out.println("Public"); 
}
public void accessPrivate() { 
privateMethod(); 
}
}