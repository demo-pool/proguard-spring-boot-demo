package cn.devit.demo.api;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(String id) {
        User u = new User();
        u.username = "admin";
        return u;
    }
}
