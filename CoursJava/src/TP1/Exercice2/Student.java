package TP1.Exercice2;


import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private float[] grades = new float[10];
    private final Scanner scanner = new Scanner(System.in);

    public Student() {
        System.out.println("Student name:");
        this.name = this.readString();

        for (int i = 0; i < 10; i++) {
            System.out.println("Grade n°=" + i + " :");
            grades[i] = this.readFloat();
        }
    }

    public Student(String name, float[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public float average() {
        float sum = 0;
        for (float grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.length;
    }

    public Boolean accept() {
        return this.average() >= 10 ? true : false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public String readString() {
        return scanner.nextLine();
    }

    public float readFloat() {
        return this.scanner.nextFloat();
    }
}
