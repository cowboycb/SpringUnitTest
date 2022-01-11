package com.codingfuture.springunittest.repo;

import com.codingfuture.springunittest.model.FirstModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirstModelRepository extends JpaRepository<FirstModel, Integer> {
}
