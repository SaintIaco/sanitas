package com.sanitas.calculator.operations;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.request.OperandWeb;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Component;

@Component
public class SubtractionOperation implements TracerAPI {

    public CalculatorWebResponse subtract(CalculatorWebRequest webRequest) {
        CalculatorWebResponse webResponse = null;
        double result = 0;
        for(OperandWeb operand : webRequest.getOperands()){
            result -= operand.getOperand();
        }
        trace(result);
        webResponse.setResult(result);

        return webResponse;
    }

    @Override
    public <T> void trace(T t) {

    }
}
