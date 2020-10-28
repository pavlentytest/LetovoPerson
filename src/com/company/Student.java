package com.company;

public class Student extends LetovoPerson {
    private int grade;

    Student(String name, double weight, int age, int year) {
        super(name, weight, age, year);
    }
    Student() {

    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    void doAction() {
        //вычисления
        if(year > 2020) {
            this.grade = 5;
        }
    }
}
