package com.sanitas.calculator.ports.primary;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.request.Operator;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import com.sanitas.calculator.operations.AdditionOperation;
import com.sanitas.calculator.operations.SubtractionOperation;
import org.springframework.stereotype.Service;

@Service
public class CalculatorCommand {

    private final AdditionOperation additionOperation;
    private final SubtractionOperation subtractionOperation;

    public CalculatorCommand(AdditionOperation additionOperation, SubtractionOperation subtractionOperation) {
        this.additionOperation = additionOperation;
        this.subtractionOperation = subtractionOperation;
    }

    public CalculatorWebResponse operate(CalculatorWebRequest webRequest) {
        CalculatorWebResponse webResponse = null;
        if(webRequest.getOperator().equals(Operator.ADDITION)){
            webResponse = additionOperation.add(webRequest);
        } else if(webRequest.getOperator().equals(Operator.SUBTRACTION)){
            webResponse = subtractionOperation.subtrac(webRequest);
        }
        return webResponse;
    }
}
