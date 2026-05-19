package com.contatodireto.demo.model;

import lombok.Getter;
import lombok.Setter;

public class Model {

    @Getter
    @Setter
    public static class User {
        private Long id;
        private String nome;
        private String email;



    }
}
