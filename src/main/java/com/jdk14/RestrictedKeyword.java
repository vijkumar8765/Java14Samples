package com.jdk14;

public record RestrictedKeyword(int age) {

    static int record = 10;
    /**
     * ‘record‘ is a restricted identifier (like ‘var‘) and isn’t a regular keyword (yet). So, the following code is valid:
     * **/
    void record() {}

}
