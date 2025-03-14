package my.project.example.userms.controller;

import my.project.example.userms.model.User;
import my.project.example.userms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("user")
public class UserController {


    @Autowired
    private IUserService userService;


    @GetMapping
    public List<User> listaUsuario(){
        return userService.listAll();
    }
}
