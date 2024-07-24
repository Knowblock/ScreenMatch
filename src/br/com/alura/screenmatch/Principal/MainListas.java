package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class MainListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(9);
        Filme starwars = new Filme("Star wars", 2005);
        starwars.avalia(10);
        var vDeVinganca = new Filme("V de vingança", 2005);
        vDeVinganca.avalia(10);
        Serie theBoys = new Serie("The boys", 2019);
        theBoys.avalia(8);


        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(vDeVinganca);
        listaAssistidos.add(starwars);
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(theBoys);
        for (Titulo item:listaAssistidos) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
                       //Lista com ordenamento
        List<String> buscaArtista = new LinkedList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Vinicius Ferreira");
        buscaArtista.add("Gambetti");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois do ordenamento " + buscaArtista);
                     //Lista com ordenamento

        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por lançamento");
        System.out.println(listaAssistidos);
    }
}
