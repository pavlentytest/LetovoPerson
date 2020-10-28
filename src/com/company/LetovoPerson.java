package com.company;

public class LetovoPerson{
    private String name;
    private double weight;
    private int age;
    protected int year;

    //@Overload
    LetovoPerson(String name, double weight, int age, int year) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.year = year;
    }
    LetovoPerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString() {
        return "LetovoPerson{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", year=" + year +
                '}';
    }

    void doAction() {
        System.out.println("doAction");
    }
}
