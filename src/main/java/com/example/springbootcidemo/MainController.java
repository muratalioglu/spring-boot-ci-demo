package com.example.springbootcidemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/main")
    public ResponseEntity<?> mainEndpoint() {
        return ResponseEntity.ok("selam");
    }

    @GetMapping("/second")
    public ResponseEntity<?> secondEndpoint() {
        return ResponseEntity.ok().build();
    
}
