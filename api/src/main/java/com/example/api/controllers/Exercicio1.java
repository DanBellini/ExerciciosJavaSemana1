package com.example.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Faça um algoritmo para receber um número qualquer e imprimir na tela se 
//o número é par ou ímpar, positivo ou negativo.

@RestController
@RequestMapping("/exercicio1")
public class Exercicio1 {

    @GetMapping("/{num}")
    // localhost:8080/exercicio1/num para acessar a rota, troque o num pelo numero
    // que deseja.
    public String verificaNumero(@PathVariable int num) {

        String parOuImpar;
        String positivoOuNegativo;

        if (num % 2 == 0) {
            parOuImpar = "par";
        } else {
            parOuImpar = "ímpar";
        }
        if (num < 0) {
            positivoOuNegativo = "negativo";
        } else {
            positivoOuNegativo = "positivo";
        }

        String resposta = num + " é " + parOuImpar + " e " + positivoOuNegativo;

        System.out.println(resposta);
        return resposta;
    }

}
