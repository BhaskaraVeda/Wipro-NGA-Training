package com.taskapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String getHello() {
        return "GET working";
    }

    @PostMapping("/hello")
    public String postHello(@RequestBody String data) {
        return "POST working: " + data;
    }

    @PutMapping("/hello")
    public String putHello(@RequestBody String data) {
        return "PUT working: " + data;
    }

    @DeleteMapping("/hello/{id}")
    public String deleteHello(@PathVariable int id) {
        return "DELETE working: " + id;
    }
}
