package br.com.fiap.model;

public class TrechoRodovia {
    private String nomeTrecho;
    private int quilometroInicial;
    private int quilometroFinal;
    private double nivelVegetacaoEmCm;
    private ValidacoesTrechoRodovia validacoesTrechoRodovia = new ValidacoesTrechoRodovia();

    public TrechoRodovia(String nomeTrecho, int quilometroInicial, int quilometroFinal, double nivelVegetacaoEmCm){
        if (!validacoesTrechoRodovia.validacaoGeral(nomeTrecho, quilometroInicial, quilometroFinal, nivelVegetacaoEmCm)){
            System.out.println("Não foi possível criar o Trecho, os dados não são válidos");
            return;
        }
        this.nomeTrecho = nomeTrecho;
        this.quilometroInicial = quilometroInicial;
        this.quilometroFinal = quilometroFinal;
        this.setNivelVegetacaoEmCm(nivelVegetacaoEmCm);
        if(validacoesTrechoRodovia.validarNome(getNomeTrecho())){
            System.out.println("Trecho criado com sucesso!");
        }
    }

    private void setNivelVegetacaoEmCm(double nivelVegetacaoEmCm) {
        this.nivelVegetacaoEmCm = nivelVegetacaoEmCm;
    }

    public String getNomeTrecho() {
        return nomeTrecho;
    }

    public int getQuilometroInicial() {
        return quilometroInicial;
    }

    public int getQuilometroFinal() {
        return quilometroFinal;
    }

    public double getNivelVegetacaoEmCm() {
        return nivelVegetacaoEmCm;
    }

    public void registrarCrescimento(double taxa){
        if(getNomeTrecho() == null){
            System.out.println("Não é possível atualizar o crescimento de um trecho inexistente.");
            return;
        }
        if(taxa<=0){
            System.out.println("Digite uma taxa de crescimento válida.");
            return;
        }
        setNivelVegetacaoEmCm(getNivelVegetacaoEmCm()+taxa);
        if(getNivelVegetacaoEmCm()>=30){
            System.out.printf("Precisa cortar a vegetação do trecho %s do km %d até o km %d\n", getNomeTrecho(), getQuilometroInicial(), getQuilometroFinal());
        }else{
            System.out.printf("A vegetação do trecho %s do km %d até o km %d está em %.2f cm\n", getNomeTrecho(), getQuilometroInicial(), getQuilometroFinal(), getNivelVegetacaoEmCm());
        }
    }
}
