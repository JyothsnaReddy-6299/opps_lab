class Employee {
int empId;
String name;
double basicSalary;

Employee(int id, String n, double sal) {
empId = id;
name = n;
basicSalary = sal;
}
}

class Salary extends Employee {

Salary(int id, String n, double sal) {
super(id, n, sal);
}

void calculateSalary() {
double hra = basicSalary * 0.20;
double da = basicSalary * 0.10;
double total = basicSalary + hra + da;

System.out.println("Employee ID: " + empId);
System.out.println("Name: " + name);
System.out.println("Total Salary: " + total);
}

public static void main(String[] args) {
Salary obj = new Salary(101, "Ravi", 25000);
obj.calculateSalary();
}
}
