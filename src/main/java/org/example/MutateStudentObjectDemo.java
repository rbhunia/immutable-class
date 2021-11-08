package org.example;

import java.util.ArrayList;
import java.util.List;

public class MutateStudentObjectDemo {

    public static void main(String[] args) {

        List<String> myHobbies = new ArrayList<>();
        myHobbies.add("Movies");

        Student student = new Student(1, "Raj", myHobbies);

        System.out.println(student);

        // mutate student via constructor
        myHobbies.add("Internet");

        System.out.println(student);

        // mutate student via setter method
        student.setName("Raj_");
        System.out.println(student);

        // mutate student via getter
        List<String> hobbies = student.getHobbies();
        hobbies.add("New hobby");
        System.out.println(student);
    }
}
