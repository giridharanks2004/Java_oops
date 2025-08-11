package dev.giridharanks.springproject;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {
    public String getAllTodo(){
        return "todo's repo";
    }
}
