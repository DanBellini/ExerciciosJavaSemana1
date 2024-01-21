package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//Escreva um código que encontre os elementos em comum que existem em dois arrays
//e imprima no console quais são esses elementos, um a um.

@RestController
@RequestMapping("/exercicio5")
public class Exercicio5 {

    @PostMapping()
    // localhost:8080/exercicio5 para acessar a rota, troque o num pelo numero
    // que deseja.
    public String itensDuplicados(@RequestBody String[][] arr) {

        List<String> primeiroArray = List.of(arr[0]);
        List<String> segundoArray = List.of(arr[1]);

        StringBuilder duplicados = new StringBuilder();

        for (int i = 0; i < primeiroArray.size(); i++) {
            if (segundoArray.contains(primeiroArray.get(i))) {
                System.out.println(primeiroArray.get(i));
                duplicados.append(primeiroArray.get(i)).append("\n");
            }
        }
        return duplicados.toString();
    }
}

// considerando que o body mandara a informação como o seguinte exemplo:
// [
// [
// "Morango",
// "Banana",
// "Maçã",
// "Uva",
// "Caqui"
// ],
// [
// "Manga",
// "Caqui",
// "Morango",
// "Amora"
// ]
// ]