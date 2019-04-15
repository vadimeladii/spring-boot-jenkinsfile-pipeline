package md.springboot.controller;

import md.springboot.repository.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/user")
public interface UserController {

    @GetMapping
    List<User> retrieve();
}
