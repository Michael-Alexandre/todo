package com.mk.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mk.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
