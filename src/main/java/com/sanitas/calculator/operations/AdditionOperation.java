package com.sanitas.calculator.operations;

import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.DoubleStream;

@Component
public class AdditionOperation implements TracerAPI {

    public Double add(List<Double> operands) {

        DoubleStream doubleStream = operands.stream().mapToDouble(Double::doubleValue);
        double result = doubleStream.sum();

        return result;
    }

    @Override
    public <T> void trace(T result) {
        System.out.println(result);
    }
}
