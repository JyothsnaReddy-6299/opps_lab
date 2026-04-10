package result;

import student.Student;

public class Result {
    public void calculate(Student s) {
        int sum = 0;
        for (int x : s.marks) sum += x;

        System.out.println(sum);
        System.out.println(sum / (double) s.marks.length);
    }

    public static void main(String[] args) {
        Student s = new Student(new int[]{80, 90, 85});
        new Result().calculate(s);
    }
}