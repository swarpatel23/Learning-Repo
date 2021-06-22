package com.swar.restfulwebservice.user;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;
    static {
        users.add(new User(1, "swar", new Date()));
        users.add(new User(2, "vyom", new Date()));
        users.add(new User(3, "maharshi", new Date()));

    }

    public List<User> findAll() {
        return users;
    }

    public User saveUser(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public User deleteUserById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (id == user.getId()) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
