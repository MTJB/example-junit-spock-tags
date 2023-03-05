package com.mtjb.demo

import com.mtjb.demo.math.Divide
import spock.lang.Specification
import spock.lang.Tag

@Tag("Spock")
class DivideSpockTests extends Specification {

    @Tag("Divide")
    void "Test divide"(int a, int b, int expected) {
        expect:
            Divide.divide(a, b) == expected
        where:
            a    | b  | expected
            10   | 10 | 1
            10   | 1  | 10
            4200 | 10 | 420
    }
}
