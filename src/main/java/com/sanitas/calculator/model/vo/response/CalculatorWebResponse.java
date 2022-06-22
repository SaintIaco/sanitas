package com.sanitas.calculator.model.vo.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalculatorWebResponse {
    private double result;
}
