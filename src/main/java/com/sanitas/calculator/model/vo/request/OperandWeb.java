package com.sanitas.calculator.model.vo.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OperandWeb {
    private double operand;
}
