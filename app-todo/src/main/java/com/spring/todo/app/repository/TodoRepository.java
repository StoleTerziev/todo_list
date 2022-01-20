package com.spring.todo.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.todo.app.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

	List<Todo> findAllByUserId(Long user);
}
