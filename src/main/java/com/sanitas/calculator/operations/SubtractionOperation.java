package com.sanitas.calculator.operations;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Component;

@Component
public class SubtractionOperation implements TracerAPI {

    public Double subtract(CalculatorWebRequest webRequest) {
        double result = 0;
        for(Double operand : webRequest.getOperands()){
            result -= operand;
            result = result * -1;
        }
        trace(result);

        return result;
    }

    @Override
    public <T> void trace(T t) {

    }
}
