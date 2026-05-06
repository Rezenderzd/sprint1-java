package br.com.fiap.main;

import br.com.fiap.model.TrechoRodovia;

public class Main {
    public static void main  (String[] args){
        TrechoRodovia trecho1 = new TrechoRodovia("Br", 10, 15, 10);
        trecho1.registrarCrescimento(15);
        TrechoRodovia trecho2 = new TrechoRodovia("Rodo Anel", 20, 30, 20);
        trecho2.registrarCrescimento(15);
    }
}
