package TP1.Exercice2;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Monica", new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f});
        System.out.println("Student1: " + student1);
        System.out.println("Average student1: " + student1.average());
    }
}
