package com.leszko.calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.Instant;

@RestController
class CalculatorController {
    @Autowired
    private Calculator calculator;

    @Autowired
    private CalculationRepository calculationRepository;

    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        String result = String.valueOf(calculator.sum(a, b));
        Calculation calculation = new Calculation(a.toString(), b.toString(), result, Timestamp.from(Instant.now()));
        calculationRepository.save(calculation);
        System.out.println("Count: " + calculationRepository.count());
        return result;
    }

    @RequestMapping("/multiply")
    String multiply(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        String result = String.valueOf(calculator.multiply(a, b));
        Calculation calculation = new Calculation(a.toString(), b.toString(), result, Timestamp.from(Instant.now()));
        calculationRepository.save(calculation);
        System.out.println("Count: " + calculationRepository.count());
        return result;
    }

    @RequestMapping("/subtract")
    String subtract(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        String result = String.valueOf(calculator.subtract(a, b));
        Calculation calculation = new Calculation(a.toString(), b.toString(), result, Timestamp.from(Instant.now()));
        calculationRepository.save(calculation);
        System.out.println("Count: " + calculationRepository.count());
        return result;
    }

    @RequestMapping("/divide")
    String divide(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        String result = String.valueOf(calculator.divide(a, b));
        Calculation calculation = new Calculation(a.toString(), b.toString(), result, Timestamp.from(Instant.now()));
        calculationRepository.save(calculation);
        System.out.println("Count: " + calculationRepository.count());
        return result;
    }
}

