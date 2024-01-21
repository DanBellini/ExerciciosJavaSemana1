package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Escreva um código que deve imprimir a tabela de multiplicação de algum 
//número fornecido além de exibir um cabeçalho com o nome Tabela de multiplicação
//de X, onde X é o número a ser multiplicado.

@RestController
@RequestMapping("/exercicio3")
public class Exercicio3 {

    @GetMapping("/{num}")
    // localhost:8080/exercicio3/num para acessar a rota, troque o num pelo numero
    // que deseja.
    public String tabelaDeMultiplicacao(@PathVariable int num) {

        StringBuilder tabela = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int prod = num * i;

            tabela.append(num).append(" x ").append(i).append(" = ").append(prod).append("\n");
            System.out.println(num + " x " + i + " = " + prod);
        }

        return tabela.toString();
    }

}
