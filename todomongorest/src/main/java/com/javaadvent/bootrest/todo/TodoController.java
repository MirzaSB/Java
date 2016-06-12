package com.javaadvent.bootrest.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
final class TodoController {

    private final TodoService service;

    @Autowired
    TodoController(TodoService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    TodoDTO create(@RequestBody @Valid TodoDTO todoEntry) {
        return service.create(todoEntry);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    TodoDTO delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TodoDTO> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    TodoDTO findById(String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    TodoDTO update(@RequestBody @Valid TodoDTO todoEntry) {
        return service.update(todoEntry);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleTodoNotFound(TodoNotFoundException ex) {}
}
