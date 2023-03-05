package com.mtjb.demo.math


import spock.lang.Specification
import spock.lang.Tag

@Tag("Spock")
class MultiplySpockTests extends Specification {

    @Tag("Multiply")
    void "Test multiple"(int a, int b, int expected) {
        expect:
            Multiply.multiply(a, b) == expected
        where:
            a  | b  | expected
            10 | 10 | 100
            1  | 10 | 10
            42 | 10 | 420
    }
}
