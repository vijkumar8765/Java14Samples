package com.jdk14;

/**
 * Instantiate a record with generics
 *
 * **/
public record Parcel<T> (T contents, double length, double width, double height, double weight) {

}
