package org.example;

import org.apache.commons.lang3.SerializationUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class ImmutableStudent {

    private final int id;
    private final String name;
    private final List<String> hobbies;
    private final LocalDate dob;
    private final Address address;

    public ImmutableStudent(int id, String name, List<String> hobbies, LocalDate dob, Address address) {
        this.id = id;
        this.name = name;
        this.hobbies = new ArrayList<>(hobbies);
        this.dob = dob;
        //this.address = new Address(address.getState(), address.getCity(), address.getZipCode());
        this.address = SerializationUtils.clone(address);
    }

    public int getId() {
        return id;
    }

//    public void setId(int id){
//        this.id = id;
//    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Address getAddress() {
        return SerializationUtils.clone(address);
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}
