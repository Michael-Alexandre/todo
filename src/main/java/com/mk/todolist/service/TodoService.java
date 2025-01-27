package com.mk.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.mk.todolist.repository.TodoRepository;
import com.mk.todolist.entity.Todo;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listTodos() {
        Sort sort = Sort.by("priority").descending().and(Sort.by("name").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> createTodo(Todo todo) {
        todoRepository.save(todo);
        return listTodos();
    }

    public List<Todo> updateTodo(Todo todo) {
        todoRepository.save(todo);
        return listTodos();
    }

    public List<Todo> deleteTodoById(Long id) {
        todoRepository.deleteById(id);
        return listTodos();
    }
}
