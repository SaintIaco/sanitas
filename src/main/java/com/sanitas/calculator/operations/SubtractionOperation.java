package com.sanitas.calculator.operations;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.request.OperandWeb;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import org.springframework.stereotype.Component;

@Component
public class SubtractionOperation {

    public CalculatorWebResponse subtract(CalculatorWebRequest webRequest) {
        CalculatorWebResponse webResponse = null;
        double result = 0;
        for(OperandWeb operand : webRequest.getOperands()){
            result -= operand.getOperand();
        }
        webResponse.setResult(result);

        return webResponse;
    }

}
