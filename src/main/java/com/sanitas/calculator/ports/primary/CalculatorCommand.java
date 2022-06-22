package com.sanitas.calculator.ports.primary;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorCommand {
    public CalculatorWebResponse operate(CalculatorWebRequest webRequest) {
        return null;
    }
}
