package com.leszko.calculator;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/** Calculator logic */
@Service
public class Calculator {
    @Cacheable("sum")
    public int sum(int a, int b) {
        return a + b;
    }

    @Cacheable("multiply")
    public int multiply(int a, int b) {
        return a * b;
    }

    @Cacheable("subtract")
    public int subtract(int a, int b) {
        return a - b;
    }

    @Cacheable("divide")
    public int divide(int a, int b) {
        return a / b;
    }
}

