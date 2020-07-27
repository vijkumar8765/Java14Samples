package com.jdk14;

public record PatternMatchingForInstanceof(String name) {

    /**
     * Many Java developers use the instanceof operator to check whether a given reference variable is of a certain type.
     * They compare a reference variable to a type by using the instanceof operator.
     * If the result is true, the next obvious step is to explicitly cast it to the type they compared it with to access its members.
     * These steps have an obvious repetition here, like compare-ifResultTrue-cast.
     *
     * **/

    /**
     * Pattern variables are final local variables that are declared and defined at the same place.
     * With other local variables, it is possible to declare them and defer their assignment.
     * You can’t assign another value to a pattern variable since it is implicitly final.
     *
     * **/
    static void outputValueInUpperCase(Object obj) {
        if(obj instanceof String input) {
            System.out.println(input.toUpperCase());
        } else {
            /**
             * Pattern variable 'input' cannot be accessed in else block
             * **/
            //System.out.println(input.toUpperCase());
        }
    }

    public static void main(String[] args) {
        PatternMatchingForInstanceof obj =  new PatternMatchingForInstanceof("vijay");
        outputValueInUpperCase("viadsafafafdafsafasfsafsafsafsasfjay");
    }
}
