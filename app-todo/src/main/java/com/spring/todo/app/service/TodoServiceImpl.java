package com.spring.todo.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.todo.app.config.auth.UserPrincipal;
import com.spring.todo.app.model.Todo;
import com.spring.todo.app.model.User;
import com.spring.todo.app.repository.TodoRepository;
import com.spring.todo.app.repository.UserRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Todo> todoListByUserId(Long userId) {
		return todoRepository.findAllByUserId(userId);
	}

	@Override
	public Optional<Todo> findById(Long todoId) {
		return todoRepository.findById(todoId);
	}

	@Override
	public Todo save(UserPrincipal currentUser, Todo todo) {
		Optional<User> user = userRepository.findById(currentUser.getId());
		todo.setUser(user.get());
		
		return todoRepository.save(todo);
	}

	@Override
	public void delete(Todo todo) {
		todoRepository.delete(todo);
	}

}
