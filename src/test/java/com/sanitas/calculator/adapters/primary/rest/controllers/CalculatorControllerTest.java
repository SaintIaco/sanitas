package com.sanitas.calculator.adapters.primary.rest.controllers;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import com.sanitas.calculator.ports.primary.CalculatorCommand;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class CalculatorControllerTest {

    private final CalculatorCommand calculatorCommand = mock(CalculatorCommand.class);

    private final CalculatorController sut = new CalculatorController(calculatorCommand);

    @Test
    public void operateTest() {
        //Given
        CalculatorWebRequest webRequest = mock(CalculatorWebRequest.class);
        CalculatorWebResponse webResponse = mock(CalculatorWebResponse.class);

        //When
        when(calculatorCommand.operate(webRequest)).thenReturn(webResponse);

        ResponseEntity<CalculatorWebResponse> actual = sut.operate(webRequest);

        //Then
        assertThat(actual.getStatusCode(), equalTo(HttpStatus.OK));
        assertThat(actual.getBody(), is(webResponse));
    }

}