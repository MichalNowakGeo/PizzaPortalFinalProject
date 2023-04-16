package com.pizzaproject.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

@GetMapping("/api/greetings")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> helloForAdmin(){
        return ResponseEntity.ok("Hello Admin");
    }
@GetMapping("/hello")
    @PreAuthorize("hasAnyRole('EMPLOYEE', 'USER')")
    public ResponseEntity<String> helloForElse(){
    return ResponseEntity.ok("Hello");
    }
}
