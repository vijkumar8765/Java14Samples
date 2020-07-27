/*
package com.com.jdk14;

import java.util.List;

*/
/**
 *
 * Refer https://www.azul.com/blog/whats-new-in-jdk14-latest-release/
 *
 * **//*

public class Jdk14Features {

    public static void main(String[] args) {

    }

    class Point {
        private final double x;
        private final double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX(){
            return x;
        }

        public double getY(){
            return y;
        }


        */
/**
         * The above class can be represented using the new JDK14 feature of "Records"
         *
         * **//*



    }

    */
/**
     * Records are designed for simplicity so they cannot extend any other class or define additional instance variables.
     * All state in a record is final, so no accessor (setter) methods are provided.
     * If you need any of that, you need to use a full-blown class.
     * **//*

    public Record Point(double x, double y) {}

    public Record Range(int min, int max) {
        */
/*public Range {
            if (min > max) {
                throw new IllegalArgumentException("Max must be >= min");
            }
        }*//*

    }

    static boolean testIinstanceof(Object o) {
        boolean result;
        if(o instanceof String s) {
            return true;
        } else {
            return false;
        }
    }

    static void NullTest() {
        List<String> list;
        list.add("0");
    }

}*/
