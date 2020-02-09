package model;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> roster;

    public Teacher(){}

    public Teacher(String name, ArrayList<Student> roster) {
        this.name = name;
        this.roster = roster;
    }

    public void addStudent(Student student) {
        this.roster.add(student);
    }

    public void addStudent(String name, int age, String gender) {
        this.addStudent(new Student(name, age, gender));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}
