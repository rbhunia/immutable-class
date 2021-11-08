package org.example;

import java.time.Month;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class ImmutableStudentDemo {

    public static void main(String[] args) {
        List<String> myHobbies = new ArrayList<>();
        myHobbies.add("Movies");

        Address address = new Address("WB", "MDN", "721102");

        ImmutableStudent immutableStudent = new ImmutableStudent(1, "Raj", myHobbies,
                LocalDate.of(1989, Month.MARCH, 17), address);
        System.out.println(immutableStudent);

        // try to mutate via constructor
        myHobbies.add("Cricket");
        System.out.println(immutableStudent);

        // try to mutate via getters
        List<String> hobbies = immutableStudent.getHobbies();
        hobbies.add("New hobby");
        System.out.println(immutableStudent.getHobbies());

        // try to mutate dob
        LocalDate dob = immutableStudent.getDob();
        dob.plusDays(5);
        System.out.println(immutableStudent);

        // try to mutate address
        address.setCity("BBSR");
        System.out.println(immutableStudent);

        Address newAddress = immutableStudent.getAddress();
        newAddress.setCity("BBSR");
        System.out.println(immutableStudent);
    }
}
