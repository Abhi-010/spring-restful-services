package com.dev.abhi.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Ravi", LocalDate.now().minusYears(25)));
        users.add(new User(3,"Ranga", LocalDate.now().minusYears(20)));
    }

    public List<User> findAllUsers(){
        return users;
    }

    public User getUser(int id){
        return users.get(id);
    }
}
