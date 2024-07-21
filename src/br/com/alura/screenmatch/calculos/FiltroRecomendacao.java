package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;

public class FiltroRecomendacao {

    public void filtra (Classificacao classificacao){
        if (classificacao.getClassificacao()>=4){
            System.out.println("Está entre os melhores da atualidade!");
        }else if(classificacao.getClassificacao()>=2) {
            System.out.println("Muito popular no momento!");
        } else {
            System.out.println("Assista mais tarde!");
        }
    }
}
