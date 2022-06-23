package com.sanitas.calculator.ports.primary;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.request.Operator;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import com.sanitas.calculator.operations.AdditionOperation;
import com.sanitas.calculator.operations.SubtractionOperation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class CalculatorCommandTest {

    private final AdditionOperation additionOperation = mock(AdditionOperation.class);
    private final SubtractionOperation subtractionOperation = mock(SubtractionOperation.class);

    private final CalculatorCommand sut = new CalculatorCommand(additionOperation, subtractionOperation);

    @Test
    void shouldOperateAddition() {
        //Given
        List<Double> operands = new ArrayList<>();
        operands.add(31.0);
        operands.add(25.0);
        CalculatorWebRequest webRequest = CalculatorWebRequest.builder().operator(Operator.ADDITION).operands(operands).build();
        CalculatorWebResponse expectedResponse = CalculatorWebResponse.builder().result(56).build();
        Double additionResult = 56.0;

        //When
        when(additionOperation.add(operands)).thenReturn(additionResult);

        CalculatorWebResponse actual = sut.operate(webRequest);

        //Then
        assertThat(actual, equalTo(expectedResponse));
        verify(additionOperation, times(1)).add(any());

    }

    @Test
    void shouldOperateSubtraction() {
        //Given
        List<Double> operands = new ArrayList<>();
        operands.add(31.0);
        operands.add(25.0);
        CalculatorWebRequest webRequest = CalculatorWebRequest.builder().operator(Operator.SUBTRACTION).operands(operands).build();
        CalculatorWebResponse expectedResponse = CalculatorWebResponse.builder().result(6).build();
        Double additionResult = 6.0;

        //When
        when(subtractionOperation.subtract(operands)).thenReturn(additionResult);

        CalculatorWebResponse actual = sut.operate(webRequest);

        //Then
        assertThat(actual, equalTo(expectedResponse));
        verify(subtractionOperation, times(1)).subtract(any());

    }
}