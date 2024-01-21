package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.api.controllers.FeriadosUtil.Feriado;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Vamos criar uma aplicação Java que será um calendário de feriados! Para isso, queremos:

// - Uma função que imprime a lista com todos os feriados
// - Uma função que recebe uma data como parâmerto e retorna uma mensagem.
//     - Se o dia não for feriado, imprime: “Dia <data-inserida> não é feriado 🥲”
//     - Se o dia for feriado, retorna: “Dia <data-inserida> é <nome-do-feriado>! 🎉”

@RestController
@RequestMapping("/holidays")
public class Exercicio6e7 {

    private static Map<String, Feriado> feriadosDoAno;

    static {
        feriadosDoAno = FeriadosUtil.getFeriados();
    }

    @GetMapping()
    // localhost:8080/holidays para acessar a rota.
    public String todosOsFeriados() {

        StringBuilder listaDeFeriados = new StringBuilder();

        System.out.println("📅 Lista de Feriados \n");
        for (Feriado feriado : feriadosDoAno.values()) {
            System.out.println("Data:" + feriado.getData() + ", Feriado: " + feriado.getNome());
            listaDeFeriados.append("Data: ").append(feriado.getData())
                    .append(", Feriado: ").append(feriado.getNome()).append("\n");
        }
        return "📅 Lista de Feriados \n" + listaDeFeriados;
    }

    @GetMapping("/{day}")
    // localhost:8080/holidays/DD-MM-AAAA para acessar a rota.
    public String verificaFeriado(@PathVariable String day) {
        return "Dia é ! 🎉";
    }

}