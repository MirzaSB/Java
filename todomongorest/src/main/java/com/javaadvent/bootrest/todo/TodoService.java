package com.javaadvent.bootrest.todo;

import java.util.List;

interface TodoService {

    TodoDTO create(TodoDTO todo);

    TodoDTO delete(String id);

    List<TodoDTO> findAll();

    TodoDTO findById(String id);

    TodoDTO update(TodoDTO todo);
}
