package com.contatodireto.demo.service;

import com.contatodireto.demo.model.Model.User;
import com.contatodireto.demo.repository.Repository;

import java.util.List;

public class Service {
    @org.springframework.stereotype.Service




    public static class UserService {
        private  final Repository.UserRepository repo;

        UserService(Repository.UserRepository repo) {
            this.repo = repo;
        }

        public List<User> findAll() {
             return repo.findAll();
        }

        public User findById(Long id) {
            return repo.findById(id);
        }

        public User save(User user) {
            return repo.save(user);
        }

        public void deleteById(Long id){
            repo.deleteById(id);
        }


    }
}
