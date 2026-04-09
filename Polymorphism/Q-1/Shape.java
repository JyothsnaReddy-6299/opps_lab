class Shape {
double area() {
return 0;
}
}

class Circle extends Shape {
 double r = 5;
double area() {
return 3.14 * r * r;
}
}
class Rectangle extends Shape {
double l = 4, b = 3;
double area() {
return l * b;
}
}

class Triangle extends Shape {
double b = 4, h = 5;

double area() {
return 0.5 * b * h;
}
}

class Test {
public static void main(String[] args) {
Shape s;

s = new Circle();
System.out.println(s.area());

s = new Rectangle();
System.out.println(s.area());

s = new Triangle();
System.out.println(s.area());
}
}