package com.example.demo.repository;

import com.example.demo.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog,Long> {
}
