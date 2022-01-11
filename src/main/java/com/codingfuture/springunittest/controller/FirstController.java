package com.codingfuture.springunittest.controller;

import com.codingfuture.springunittest.model.FirstModel;
import com.codingfuture.springunittest.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {

    @Autowired
    private FirstService firstService;

    @GetMapping("/first")
    public String firstMethod(){
        return "Welcome First Method";
    }

    @GetMapping("/first-service")
    public FirstModel firstFromService(){
        return firstService.fetchFromService();
    }

    @GetMapping("/from-repo")
    public List<FirstModel> fetchFromRepo(){
        return firstService.retrieveAllModels();
    }
}
