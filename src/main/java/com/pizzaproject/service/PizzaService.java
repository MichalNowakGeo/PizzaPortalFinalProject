package com.pizzaproject.service;

import com.pizzaproject.model.Pizza;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.pizzaproject.repository.PizzaRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    public Pizza getPizzaById(Long id) {
        return pizzaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pizza not found!"));
    }

    public Pizza savePizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void deletePizzaById(Long id) {
        pizzaRepository.deleteById(id);
    }
}
