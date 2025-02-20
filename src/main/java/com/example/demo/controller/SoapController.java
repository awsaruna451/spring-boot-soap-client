package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SoapClientService;

@RestController
@RequestMapping("/api/soap")
public class SoapController {

    @Autowired
    private SoapClientService soapClientService;

    @PostMapping("/example")
    public String getExample(@RequestBody String name) {
        return soapClientService.getExample(name);
    }
} 