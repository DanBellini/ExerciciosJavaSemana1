package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Dado um número inteiro x, imprima uma sequência de Fibonacci de tamanho x.
@RestController
@RequestMapping("/exercicio2")
public class Exercicio2 {

    @GetMapping("/{num}")
    // localhost:8080/exercicio2/num para acessar a rota, troque o num pelo numero
    // que deseja.
    public String sequenciaFibonacci(@PathVariable int num) {

        if (num < 0)
            return "numero inválido";

        StringBuilder sequencia = new StringBuilder();

        for (int i = 0; i < num; i++) {
            sequencia.append(fibonacci(i)).append(" ");
        }

        System.out.println(sequencia.toString());
        return sequencia.toString();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
