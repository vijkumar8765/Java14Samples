package com.jdk14;

/**
 * Instantiate a record with generics
 *
 * **/
public class Table {
    public static void main(String[] args) {
        Parcel<Table> parcel = new Parcel<>(new Table(), 200, 100, 55, 136.88);
        System.out.println(parcel);
    }
}
