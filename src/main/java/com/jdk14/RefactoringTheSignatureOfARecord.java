package com.jdk14;

/**
 * You can refactor a Record and modify the order of its components or types, modify their names,
 * and add new or remove existing ones. IntelliJ IDEA 2020.1 introduces a simplified approach to apply Rename or Change Signature Refactorings.
 * The changes would reflect in a record’s canonical constructor and its instance creation:
 * **/
public class RefactoringTheSignatureOfARecord {

    public static void main(String[] args) {
        var vijay = new Person1("kishor", 22);
        System.out.println(vijay.name());
    }

    record Person1(String name, int age) {
        public Person1(String name, int age) {
            if(name == null || age < 10) {
                throw new IllegalArgumentException("Validation failed...");
            }
            this.name = name;
            this.age = age;
        }

        /*public Person1(int age, String name) {
            if(name == null || age < 10) {
                throw new IllegalArgumentException("Validation failed...");
            }
            this.name = name;
            this.age = age;
        }*/
    }
}
