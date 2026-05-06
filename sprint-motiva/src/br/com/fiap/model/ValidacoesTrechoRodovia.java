package br.com.fiap.model;

public class Validacoes {

    public boolean validarNome(String nome){
        if(nome.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    public boolean validarQuilometros(int kmInicial, int kmFinal){
        if(kmFinal<kmInicial || kmInicial<0 || kmFinal<1 ){
            return false;
        }else{
            return true;
        }
    }

    public boolean validarNivelVegetacao(double nivelVegetacao){
        if(nivelVegetacao<0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean validacaoGeral(String nomeTrecho, int kmInicial, int kmFinal, double nivelVegetacao){
        if(!validarNome(nomeTrecho)|| !validarQuilometros(kmInicial, kmFinal)|| !validarNivelVegetacao(nivelVegetacao)){
            return false;
        }else{
            return true;
        }
    }
}
