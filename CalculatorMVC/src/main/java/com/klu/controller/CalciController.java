package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.service.CalciService;

@RestController
@RequestMapping("/calculator")
public class CalciController {

    @Autowired
    private CalciService service;

    // ADDITION
    // http://localhost:8081/calculator/add?a=10&b=5
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // SUBTRACTION
    // http://localhost:8081/calculator/subtract/20/5
    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return service.subtract(a, b);
    }

    // MULTIPLICATION
    // http://localhost:8081/calculator/multiply/{a}/{b}
    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return service.multiply(a, b);
    }

    // DIVISION
    // http://localhost:8081/calculator/divide/{a}/{b}
    @GetMapping("/divide/{a}/{b}")
    public double divide(@PathVariable int a, @PathVariable int b) {
        return service.divide(a, b);
    }

    // MODULO
    // http://localhost:8081/calculator/modulo/{a}/{b}
    @GetMapping("/modulo/{a}/{b}")
    public int modulo(@PathVariable int a, @PathVariable int b) {
        return service.modulo(a, b);
    }
}
