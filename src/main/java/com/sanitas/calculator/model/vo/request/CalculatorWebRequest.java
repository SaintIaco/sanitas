package com.sanitas.calculator.model.vo.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CalculatorWebRequest {

    private Operator operator;
    private List<Double> operands;
}
