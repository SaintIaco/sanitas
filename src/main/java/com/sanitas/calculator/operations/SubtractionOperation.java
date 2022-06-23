package com.sanitas.calculator.operations;

import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

@Component
public class SubtractionOperation implements TracerAPI {

    public Double subtract(List<Double> operands) {

        DoubleStream doubleStream = operands.stream().mapToDouble(Double::doubleValue);
        OptionalDouble result = doubleStream.reduce((a, b) -> (a - b));

        return result.getAsDouble();
    }

    @Override
    public <T> void trace(T result) {
        System.out.println(result);
    }
}
