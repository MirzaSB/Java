package com.javaadvent.bootrest.todo;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

interface TodoRepository extends Repository<Todo, String> {

    void delete(Todo deleted);

    List<Todo> findAll();

    Optional<Todo> findOne(String id);

    Todo save(Todo saved);
}
