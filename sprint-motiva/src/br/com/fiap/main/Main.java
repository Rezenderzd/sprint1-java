package br.com.fiap.main;

import br.com.fiap.model.TrechoRodovia;

public class Main {
    public static void main  (String[] args){
        int kmInicial;
        int kmFinal;
        double nivelVegetacaoEmCm;

        kmInicial = 10;
        kmFinal = 15;
        nivelVegetacaoEmCm = 10;

        TrechoRodovia trecho1 = new TrechoRodovia("Br", kmInicial, kmFinal, nivelVegetacaoEmCm);
        trecho1.registrarCrescimento(15);

        kmInicial = 20;
        kmFinal = 30;
        nivelVegetacaoEmCm = 20;
        TrechoRodovia trecho2 = new TrechoRodovia("Rodo Anel", kmInicial, kmFinal, nivelVegetacaoEmCm);
        trecho2.registrarCrescimento(15);
    }
}
