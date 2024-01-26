package com.example.restapi_shakespear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/insults")
public class InsultController {

    @GetMapping("/greeting")
    public String greeting(){
        return "hey shakespeare";
    }
}
