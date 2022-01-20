package com.spring.todo.app.service;

import java.util.List;
import java.util.Optional;

import com.spring.todo.app.config.auth.UserPrincipal;
import com.spring.todo.app.model.Todo;

public interface TodoService {
	
	List<Todo> todoListByUserId(Long userId);

	Optional<Todo> findById(Long todoId);

	Todo save(UserPrincipal currentUser, Todo todo);

	void delete(Todo todo);

}
