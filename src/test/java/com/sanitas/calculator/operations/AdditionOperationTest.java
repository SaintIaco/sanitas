package com.sanitas.calculator.operations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class AdditionOperationTest {

    private final AdditionOperation sut = new AdditionOperation();

    @Test
    void add() {
        //Given
        List<Double> operands = new ArrayList<>();
        operands.add(31.0);
        operands.add(25.0);

        //When
        Double actual = sut.add(operands);

        //Then
        assertThat(actual, equalTo(56.0));
    }
}