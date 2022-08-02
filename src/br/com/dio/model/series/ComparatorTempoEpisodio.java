package br.com.dio.model.series;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());

        int tempoEpisodio =  Integer.compare(serie1.getTempoEpisodios(), serie2.getTempoEpisodios());

        if(tempoEpisodio > 0) return tempoEpisodio;

        return nome;
    }
}
