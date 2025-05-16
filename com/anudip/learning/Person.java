package com.anudip.learning;
public class Person {
    String name;
    int age;
    int salary;

    public Person(String name, int age, int salary)
    {
        this.name= name;
        this.age= age;
        this.salary= salary;
    }
    public static void main(String[] args) {
        System.out.println("Successful");
        Person per= new Person("Himanshu", 23, 0);
        System.out.println(per.name);
        System.out.println(per.age);
        System.out.println(per.salary);
    }
}
