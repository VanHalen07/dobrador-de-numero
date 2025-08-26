package com.tds.User;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User newUser = new User(1, "Sherk", "shrek@gmail.com", 30);
        User newUser2 = new User(2, "Burro", "burro@gmail.com", 25);
        User newUser3 = new User(3, "Fiona", "fiona@gmail.com", 18);
        User newUser4 = new User(4, "Encantado", "encantado@gmail.com", 21);
        User newUser5 = new User(5, "FadaMadrinha", "fadamadrinha@gmail.com", 41);
        User newUser6 = new User(6, "GatodeBotas", "gatodebotas@gmail.com", 5);

        userService.createUser(newUser);
        userService.createUser(newUser2);
        userService.createUser(newUser3);
        userService.createUser(newUser4);
        userService.createUser(newUser5);
        userService.createUser(newUser6);

        System.out.println(userService.findUserById(newUser.getId()));

        System.out.println(userService.findUserByEmail("joao@gmail.com"));

        System.out.println(userService.findByName("Isabel"));

        System.out.println("/=====================\\");

        userService.listAllUsers();
    }

}