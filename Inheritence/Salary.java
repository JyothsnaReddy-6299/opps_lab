class Employee{
String name;
int id;
void getEmployee(String n, int i){
name = n;
id = i;
}
}
class Salary extends Employee{
double salary;
void getSalary(double s){
salary = s;
}
}
class NetSalary extends Salary{
void Calculate(){
double hra = salary * 0.2;
double da = salary * 0.1;
double net = salary + hra + da;
System.out.println("Name: " + name);
System.out.println("Employee ID: " + id);
System.out.println("Net Salary: " + net);
}

public static void main(String []args){
NetSalary obj = new NetSalary();
obj. getEmployee("ravi",1003);
obj. getSalary(135000);
obj.Calculate();

}
}