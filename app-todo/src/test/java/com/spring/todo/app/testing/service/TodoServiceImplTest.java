package com.spring.todo.app.testing.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.todo.app.repository.TodoRepository;

public class TodoServiceImplTest {

	@Mock
	private TodoRepository todoRepository;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testTodoListByUserId() {
		fail("Not yet implemented");
	}

}
