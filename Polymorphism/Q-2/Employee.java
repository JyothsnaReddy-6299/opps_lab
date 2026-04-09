class Employee{
double calculateSalary(){return 0;}
}

class FullTimeEmployee extends Employee{
double calculateSalary(){return 50000;}
}

class PartTimeEmployee extends Employee{
double calculateSalary(){return 20000;}
}

class ContractEmployee extends Employee{
double calculateSalary(){return 30000;}
}

class TestEmp{
public static void main(String[] args){
Employee e;

e=new FullTimeEmployee();
System.out.println(e.calculateSalary());

e=new PartTimeEmployee();
System.out.println(e.calculateSalary());

e=new ContractEmployee();
System.out.println(e.calculateSalary());
}
}