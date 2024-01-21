package com.example.api.controllers;

import java.util.HashMap;
import java.util.Map;

public class FeriadosUtil {

    public static class Feriado {

        private String data;
        private String nome;

        public Feriado(String data, String nome) {
            this.data = data;
            this.nome = nome;
        }

        public String getData() {
            return data;
        }

        public String getNome() {
            return nome;
        }
    }

    private static Map<String, Feriado> feriadosDoAno = new HashMap<>();

    static {
        feriadosDoAno.put("01-01-2024", new Feriado("01-01-2024", "Confraternização Mundial"));
        feriadosDoAno.put("12-02-2024", new Feriado("12-02-2024", "Carnaval"));
        feriadosDoAno.put("13-02-2024", new Feriado("13-02-2024", "Carnaval"));
        feriadosDoAno.put("29-03-2024", new Feriado("29-03-2024", "Sexta-feira Santa"));
        feriadosDoAno.put("21-04-2024", new Feriado("21-04-2024", "Tiradentes"));
        feriadosDoAno.put("01-05-2024", new Feriado("01-05-2024", "Dia do Trabalho"));
        feriadosDoAno.put("30-05-2024", new Feriado("30-05-2024", "Corpus Christi"));
        feriadosDoAno.put("07-09-2024", new Feriado("07-09-2024", "Independência do Brasil"));
        feriadosDoAno.put("12-10-2024", new Feriado("12-10-2024", "Nossa Senhora Aparecida"));
        feriadosDoAno.put("02-11-2024", new Feriado("02-11-2024", "Finados"));
        feriadosDoAno.put("15-11-2024", new Feriado("15-11-2024", "Proclamação da República"));
        feriadosDoAno.put("20-11-2024", new Feriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        feriadosDoAno.put("25-12-2024", new Feriado("25-12-2024", "Natal"));

    }

    public static Map<String, Feriado> getFeriados() {
        return feriadosDoAno;
    }
}