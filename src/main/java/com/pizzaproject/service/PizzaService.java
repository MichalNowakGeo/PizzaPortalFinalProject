package com.pizzaproject.service;

import com.pizzaproject.model.Pizza;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    public Optional<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    public Optional<Pizza> getPizzaById(Long id) {
        return pizzaRepository.findById(id);
    }

    public Pizza savePizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void deletePizzaById(Long id) {
        pizzaRepository.deleteById(id);
    }
}
