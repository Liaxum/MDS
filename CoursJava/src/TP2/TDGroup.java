package TP2;

import java.util.ArrayList;

public class TDGroup {
    private final String name;
    private final ArrayList<Student> students;
    private int nbStudent;

    public TDGroup(String name, int maxStudent) {
        this.name = name;
        students = new ArrayList<Student>(maxStudent);
        nbStudent = 0;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        this.nbStudent++;
    }

    public void addStudent(int id, String name, String nickname) {
        this.students.add(new Student(id, name, nickname));
        this.nbStudent++;
    }

    public void display() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public int findStudent(int id, String name, String nickname) {
        return this.students.indexOf(new Student(id, name, nickname));
    }

    public void removeStudent(int id, String name, String nickname) {
        int placeIntoList = this.findStudent(id, name, nickname);
        if (placeIntoList != -1) {
            this.students.remove(placeIntoList);
            this.nbStudent--;
        } else {
            System.out.println("Can't find student " + name);
        }
    }
}
