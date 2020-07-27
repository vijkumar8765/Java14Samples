package com.jdk14;

import java.io.*;
import java.nio.file.Paths;

public record ReadingAndWritingToFile(String name, int age) implements Serializable {

    public static void main(String[] args) {
        Person person = new Person("Java", 25);
        String path = new File("").getAbsolutePath() + "/Java14-records.java";
        System.out.println(path);
        writeToFile(person, path);
        readFromFile(path);
    }

    static void writeToFile(Person person, String path) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(person);
            System.out.println("File Written Successfully");
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void readFromFile(String path) {
        Person person = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            person = (Person) ois.readObject();
            System.out.println("File Read Successfully: " + person);
        }catch (ClassNotFoundException | IOException exception) {
            System.out.println(exception.getMessage());
        }
        //File f = new File(path);
        //f.deleteOnExit();
        System.out.println("File Deleted Successfully");
    }
}