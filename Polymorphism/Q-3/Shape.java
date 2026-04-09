abstract class Shape{
abstract double area();
}

class Circle extends Shape{
double r=5;
double area(){return 3.14*r*r;}
}

class Rectangle extends Shape{
double l=4,b=3;
double area(){return l*b;}
}

class Test{
public static void main(String[] args){
Shape[] s=new Shape[2];

s[0]=new Circle();
s[1]=new Rectangle();

for(int i=0;i<s.length;i++){
System.out.println(s[i].area());
}
}
}