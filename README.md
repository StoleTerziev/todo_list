# todo_list


## features considered
1. User can create TODOs
2. Todo list is sorted by target date in descending order
3. User can check/uncheck todo
4. User can delete the todo
5. Login/Logout feature
6. User Role Based JWT authentication with signup feature

# Code Explaination

The entire coding logic is divided into two main part, frontend and backend code. Frontend is developed using Angular and backend using Spring Boot. These technologies have been chosen because of their ease of development.

## Front End Code Explaination
Front end code is developed using components like login, logout, menu, home, todo list and todo.
Similarly, angular code is architected into multiple layer with service, constant and component layer.

## Back End Code Explaination
Backend is organised into JwtAuthenticationRestController and TodoController process. Appropriately Model beans, service and repository classes/interfaces have been created. JPARepository interface is used to provide JPA features around the model classes.

H2 with hibernate is configured to store in-memory data.
Similarly, exception handling, utility, web security classes have been configured.

## Things to consider in future
1. JUnit test cases - considering all testcases for each method.
2. angular test cases - 
3. e2e test cases 
4. Code optimisation - using caching to store todos at client/server side.
