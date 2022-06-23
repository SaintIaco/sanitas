package com.sanitas.calculator.adapters.primary.rest.controllers;

import com.sanitas.calculator.model.vo.request.CalculatorWebRequest;
import com.sanitas.calculator.model.vo.response.CalculatorWebResponse;
import com.sanitas.calculator.ports.primary.CalculatorCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sanitas/calculator")
public class CalculatorController  {

    @Autowired
    private CalculatorCommand calculatorCommand;

    public CalculatorController(CalculatorCommand calculatorCommand) {
        this.calculatorCommand = calculatorCommand;
    }

    @PostMapping
    public ResponseEntity<CalculatorWebResponse> operate(@RequestBody CalculatorWebRequest webRequest){
        final CalculatorWebResponse webResponse = calculatorCommand.operate(webRequest);
        return new ResponseEntity<>(webResponse, HttpStatus.OK);
    }

}
