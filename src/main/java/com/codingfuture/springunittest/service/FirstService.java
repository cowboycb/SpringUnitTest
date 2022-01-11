package com.codingfuture.springunittest.service;

import com.codingfuture.springunittest.model.FirstModel;
import com.codingfuture.springunittest.repo.FirstModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FirstService {

    private final FirstModelRepository repository;

    public FirstModel fetchFromService() {
        return FirstModel.builder()
                .id(1)
                .name("Model")
                .address("location")
                .build();
    }

    public List<FirstModel> retrieveAllModels(){
        return repository.findAll();
    }

}
