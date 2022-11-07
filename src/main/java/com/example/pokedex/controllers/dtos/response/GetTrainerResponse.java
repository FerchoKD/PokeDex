package com.example.pokedex.controllers.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetTrainerResponse {
    private Long id;

    private String name;

    private String password;

    private String age;

    private String category;

    private String image;
}
