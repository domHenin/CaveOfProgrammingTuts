package com.caveofprogramming.tutorials.serialization_saving_objects_to_file;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ']';
    }
}



//TODO:
// set a person id
// set a person name