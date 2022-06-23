package com.sanitas.calculator.model.vo.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CalculatorWebRequest {

    Operator operator;
    List<Double> operands;
}
