package com.mtjb.demo.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("JUnit")
public class DivideJunitTests {

    @Tag("Divide")
    @ParameterizedTest
    @CsvSource({"10,10,1", "10,1,10", "4200,10,420"})
    public void testMultiply(int a, int b, int expected) {
        Assertions.assertEquals(expected, Divide.divide(a, b));
    }
}
