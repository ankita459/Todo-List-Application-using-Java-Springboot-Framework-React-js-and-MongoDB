package com.example.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Task;
public interface TaskRepository extends MongoRepository<Task, String> {

}
