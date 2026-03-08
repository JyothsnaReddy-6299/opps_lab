class BankAccount {

private double balance;

public void deposit(double amount) {
balance = balance + amount;
}

public void withdraw(double amount) {
if (amount <= balance) {
balance = balance - amount;
}
}

public double getBalance() {
return balance;
}

public static void main(String args[]) {

BankAccount acc = new BankAccount();

acc.deposit(1000);
acc.withdraw(200);

System.out.println("Your account balance: "+acc.getBalance());

}

}