class Student{
String name;
int RollNo;
Student(String name , int RollNo){
this.name = name;
this.RollNo = RollNo;
}
String getname(){
return name;
}
int getRollNo(){
return RollNo;
}
}
class Data{
public static void main(String[]args){
Student obj=new Student("ram",1234);
System.out.println("Name: "+obj.getname());
System.out.println("Roll Number: "+obj.getRollNo());
}
}