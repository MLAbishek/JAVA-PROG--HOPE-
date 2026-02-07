package OOPS;

import java.util.*;

public class initial {
    public static void main(String[] args) {
        Student one = new Student("kisna", 9);
        one.kupudu();
    }
}

class Student {
    String name;
    int age;

    Student(String s, int num) {
        this.name = s;
        this.age = num;
    };

    private String greet() {
        return "Hello";
    }

    public void kupudu() {
        System.out.println(greet() + " " + this.name);
        
    }
}