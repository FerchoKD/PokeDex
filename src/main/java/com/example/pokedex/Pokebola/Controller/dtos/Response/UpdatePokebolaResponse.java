package com.example.pokedex.Pokebola.Controller.dtos.Response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdatePokebolaResponse {
    private Long id_Pokebola;
    private String nombre;
    private String nivel;
    private String color;
}