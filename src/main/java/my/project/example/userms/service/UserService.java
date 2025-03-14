package my.project.example.userms.service;


import my.project.example.userms.model.User;
import my.project.example.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> listAll() {
        return repository.findAll();
    }
}
