package br.com.dio;

import br.com.dio.model.series.ComparatorGenero;
import br.com.dio.model.series.ComparatorNomeGeneroTempoEpisodio;
import br.com.dio.model.series.ComparatorTempoEpisodio;
import br.com.dio.model.series.Serie;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {

        /*Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Exiba se o SET contem a nota 5.0: ");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double nota = iterator.next();

            soma += nota;
        }
        System.out.println("Soma das notas: " + soma);

        System.out.println("Média das notas: " + soma / notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();

            if(next < 7d) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Mostre as notas na ordem que foram informadas: ");
        //LinkedHashSet<Double> notasLinkadas = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        LinkedHashSet<Double> notasLinkadas = new LinkedHashSet<>();
        notasLinkadas.add(7d);
        notasLinkadas.add(8.5);
        notasLinkadas.add(9.3);
        notasLinkadas.add(5d);
        notasLinkadas.add(7d);
        notasLinkadas.add(0d);
        notasLinkadas.add(3.6);
        System.out.println(notasLinkadas.toString());

        System.out.println("Exiba as notas em ordem crescente: ");
        Set<Double> notas2 = new TreeSet<>(notasLinkadas);
        System.out.println(notas2);

        System.out.println("Apague todas as notas: ");
        notas2.clear();
        System.out.println("O SET esta vazio? " + notas2.isEmpty());*/

        // Ordenação

        Set<Serie> listaSeries = new HashSet<>();
        listaSeries.add(new Serie("GoT", "Fantasia", 60));
        listaSeries.add(new Serie("DARK", "Drama", 60));
        listaSeries.add(new Serie("That 70's Show", "Comédia", 25));

        System.out.println("--\tOrdem Aleatória\t--");
        for(Serie serie: listaSeries){
            System.out.println(serie.getNome()+" - "+ serie.getGenero() + " - " + serie.getTempoEpisodios());
        }
        System.out.println("\r\n");

        System.out.println("--\tOrdem Inserção\t--");
        Set<Serie> listaSeries2 = new LinkedHashSet<>(){{
            add(new Serie("GoT", "Fantasia", 60));
            add(new Serie("DARK", "Drama", 60));
            add(new Serie("That 70's Show", "Comédia", 25));
        }};
        for(Serie serie: listaSeries2){
            System.out.println(serie.getNome()+" - "+ serie.getGenero() + " - " + serie.getTempoEpisodios());
        }
        System.out.println("\r\n");

        System.out.println("--\tOrdem Natural(Tempo Episódio)\t--");
        Set<Serie> listaSeries3 = new TreeSet<>(listaSeries2);
        for(Serie serie: listaSeries3){
            System.out.println(serie.getNome()+" - "+ serie.getGenero() + " - " + serie.getTempoEpisodios());
        }
        System.out.println("\r\n");

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> listaSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        listaSeries4.addAll(listaSeries);
        for(Serie serie: listaSeries4){
            System.out.println(serie.getNome()+" - "+ serie.getGenero() + " - " + serie.getTempoEpisodios());
        }
        System.out.println("\r\n");

        System.out.println("--\tOrdem Gênero\t--");
        Set<Serie> listaSeries5 = new TreeSet<>(new ComparatorGenero());
        listaSeries5.addAll(listaSeries);
        for(Serie serie: listaSeries5){
            System.out.println(serie.getNome()+" - "+ serie.getGenero() + " - " + serie.getTempoEpisodios());
        }
        System.out.println("\r\n");

        System.out.println("--\tOrdem Tempo de Episódios\t--");
        Set<Serie> listaSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
        listaSeries6.addAll(listaSeries);
        for(Serie serie: listaSeries6){
            System.out.println(serie.getNome()+" - "+ serie.getGenero() + " - " + serie.getTempoEpisodios());
        }
        System.out.println("\r\n");


    }
}
