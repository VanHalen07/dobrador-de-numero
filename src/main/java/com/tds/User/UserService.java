package com.tds.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    void createUser(User user) {
        User newUser = new User(
                user.getId(),
                user.getNome(),
                user.getEmail(),
                user.getIdade()
        );
        users.add(newUser);
    }

    User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    void updateUser(User user) {
        User userUpdate = findUserById((user.getId()));
        userUpdate.setNome(user.getNome());
        userUpdate.setEmail(user.getEmail());
        userUpdate.setIdade(user.getIdade());
    }

    void deleteUser(int id) {
        User user = findUserById(id);
        users.remove(user);
    }

    // Criar o método findUserByEmail
    User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    // Criar o método findByName
    User findByName(String name) {
        for (User user : users) {
            if (user.getNome().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // criar o método listAllUsers
    User listAllUsers() {
        for (User user : users) {
            System.out.println(user);
        }
        return null;
    }

}