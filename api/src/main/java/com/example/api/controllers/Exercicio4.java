package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Crie uma pirâmide de números, onde você deve imprimir em cada linha separada 
//a quantidade de números que está sendo iterado no momento. 

@RestController
@RequestMapping("/exercicio4")
public class Exercicio4 {

    @GetMapping("/{num}")
    // localhost:8080/exercicio4/num para acessar a rota, troque o num pelo numero
    // que deseja.
    public String piramideNumerica(@PathVariable int num) {

        StringBuilder piramide = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                piramide.append(i);
                System.out.print(i);
            }
            piramide.append("\n");
            System.out.println();
        }
        return piramide.toString();
    }
}
