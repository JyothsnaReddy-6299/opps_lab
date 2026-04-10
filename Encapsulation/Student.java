class Student{
private int[] marks=new int[5];

void setMarks(int[] m){
for(int i=0;i<5;i++)
marks[i]=m[i];
}
void display(){
for(int i=0;i<5;i++)
System.out.print(marks[i]+" ");
}
double average(){
int sum=0;
for(int i=0;i<5;i++)
sum+=marks[i];
return sum/5.0;
}
public static void main(String[] args){
Student s=new Student();
int m[]={80,90,85,70,95};
s.setMarks(m);
s.display();
System.out.println("\n"+s.average());
}
}