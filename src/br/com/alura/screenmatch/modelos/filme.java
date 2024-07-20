package br.com.alura.screenmatch.modelos;

public class filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.screenmatch.modelos.filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacao/totalDeAvaliacoes;
    }

}
