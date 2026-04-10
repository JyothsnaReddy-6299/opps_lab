class Employee{
private int[] salary=new int[5];

void setSalary(int[] s){
for(int i=0;i<5;i++)
salary[i]=s[i];
}
int highest(){
int max=salary[0];
for(int i=1;i<5;i++)
if(salary[i]>max)
max=salary[i];
return max;
}
public static void main(String[] args){
Employee e=new Employee();
int s[]={20000,30000,25000,40000,35000};
e.setSalary(s);
System.out.println(e.highest());
}
}