package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Data
public class Student implements Serializable {

    private int id;
    private String name;
    private List<String> hobbies;
}
