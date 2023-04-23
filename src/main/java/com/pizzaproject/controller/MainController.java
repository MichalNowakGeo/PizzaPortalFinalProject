package com.pizzaproject.controller;


import com.pizzaproject.model.Pizza;
import com.pizzaproject.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final PizzaService pizzaService;

    @GetMapping("/api/pizza/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Pizza getPizza(@PathVariable Long id) {
        return pizzaService.getPizzaById(id);
    }

    @GetMapping("/hello")
    @PreAuthorize("hasAnyRole('EMPLOYEE', 'USER')")
    public ResponseEntity<String> helloForElse() {
        return ResponseEntity.ok("Hello");
    }
}