package com.jdk14;


import java.io.Serializable;

/**
 * However, since a record is a final class, you can’t define it as an abstract class.
 * Additionally, it can’t extend another class (since it implicitly extends the java.lang.Record class).
 * But there are no restrictions on its implementing interfaces.
 *
 * Even though you can add static fields to a record, you can’t add instance variables to it.
 * This is because a record is supposed to limit the instance members to the components it defines in the record definition.
 *
 * When you invoke inspection ‘Generate’ (Alt + Insert for Win and Linux/ ^N for macOS) to generate code
 * for insertion in a record, you’ll notice that you don’t get an option to generate setters.
 * This is intentional because a record is supposed to be (shallowly) immutable.
 * **/

public record Person(String name, int age) implements Serializable {

    /**
     * compact constructor
     * **/
    public Person {
        instanceCtr++;
        if (age < 10) {
            throw new IllegalArgumentException("age cannot be less than 10");
        }
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
    }

    static int instanceCtr;
    private static int fathersAge;
    static int getFathersAge() {
        return fathersAge;
    }
    static int getInstanceCtr() {
        return instanceCtr;
    }

    /**
     * Setters are not allowed for instance variables as Record is immutable.
     * **/
    /*public Person setName(String name) {
        this.name = name;
    }*/
}
