package dev.giridharanks.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo") // maping a common request to it's sub requests
public class TodoController {
    
    @Autowired
    public TodoService a;

    @GetMapping("/get")
    public String get(){
        return a.getAll();
    }

    @GetMapping("/1") // sub requests
    public String todo(){
        return "todo";
    }

    @GetMapping("/{id}") // path variable
    public String todobyid(@PathVariable int id){
        return "todo id "+id;
    }
    // request param custom name
    @GetMapping("/")
    public String todobyidreq(@RequestParam("todoid") int id){
        if(id == 20){
            return "id is matched!";
        }
        return "id mismatch";
    }
    //user id pwd
    @GetMapping("/create")
    public String creatac(@RequestParam String uid,@RequestParam String pass){
        if(uid.equals("giri") && pass.equals("ksg")){
            return "welcome home " + uid;
        }
        return "poda veliya";
    }

    @PostMapping("/createac")
    public String createacSec(@RequestBody String input){
        return input;
    }
}
