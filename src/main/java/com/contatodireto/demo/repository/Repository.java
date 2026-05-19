package com.contatodireto.demo.repository;

import com.contatodireto.demo.model.Model.User;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    @org.springframework.stereotype.Repository

    public static class UserRepository{

        private final List<User> users = new ArrayList<>();

        public List<User> findAll(){
            return users;
        }
        public User findById(Long id){
            return users.stream()
                    .filter( u -> u.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }

        public User save(User user){
             users.add(user);
             return user;
        }

        public void deleteById(Long id){
            users.removeIf(u -> u.getId().equals(id));
        }








    }
}
