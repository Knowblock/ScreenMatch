import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.getDuracaoEmMinutos();
        System.out.println("duração do filme: "+ meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        System.out.println("Total de avalições: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie theBoys = new Serie();

        theBoys.setNome("The boys");
        theBoys.setTemporadas(4);
        theBoys.setEpisodiosPorTemporada(8);
        theBoys.setMinutosPorEpisodios(60);
        System.out.println("Tempo para maratonar The boys: "+ theBoys.getDuracaoEmMinutos() + " minutos");


        Filme starwars = new Filme();
        starwars.setNome("O poderoso chefão");
        starwars.setAnoDeLancamento(2005);
        starwars.setDuracaoEmMinutos(140);
        starwars.getDuracaoEmMinutos();
        System.out.println("duração do filme: "+ starwars.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(starwars);
        calculadora.inclui(theBoys);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theBoys);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);


    }
}
