package dev.giridharanks.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todo_ob;

    public String getAll(){
        return todo_ob.getAllTodo();
    }
}
