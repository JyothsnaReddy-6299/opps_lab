class Student {

private int marks;

public void setMarks(int m){
marks = m;
}

public int getMarks(){
return marks;
}

public static void main(String[] args){

Student s = new Student();

s.setMarks(85);

System.out.println("Student Marks: " + s.getMarks());

}

}