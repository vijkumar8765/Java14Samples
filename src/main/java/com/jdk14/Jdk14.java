package com.jdk14;

/**
 *
 * Refer https://blog.jetbrains.com/idea/2020/03/java-14-and-intellij-idea/
 *
 * **/
public class Jdk14 {
    public static void main(String[] args) {
        var shreya = new Person("Shreya", 10);
        var harry = new Person("Harry", 45);
        System.out.println(shreya);
        System.out.println(harry);
        System.out.println(shreya.equals(harry));
        System.out.println(shreya.name());
        System.out.println(shreya.age());
        System.out.println(shreya.hashCode());
        System.out.println(shreya.toString());
        System.out.println(harry.toString());
    }
}
