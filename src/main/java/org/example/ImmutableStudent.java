package org.example;

import lombok.Getter;
import lombok.ToString;
import org.apache.commons.lang3.SerializationUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString
public final class ImmutableStudent {

    @Getter
    private final int id;

    @Getter
    private final String name;
    private final List<String> hobbies;

    @Getter
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

//    public void setId(int id){
//        this.id = id;
//    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    public Address getAddress() {
        return SerializationUtils.clone(address);
    }
}
