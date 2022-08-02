package br.com.dio.model.series;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private int tempoEpisodios;

    public Serie() {  }

    public Serie(String nome, String genero, int tempoEpisodios) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodios = tempoEpisodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTempoEpisodios() {
        return tempoEpisodios;
    }

    public void setTempoEpisodios(int tempoEpisodios) {
        this.tempoEpisodios = tempoEpisodios;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodios=" + tempoEpisodios +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return tempoEpisodios == serie.tempoEpisodios && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodios);
    }


    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodios(), serie.getTempoEpisodios());
        int genero = this.getGenero().compareTo(serie.getGenero());

        if(tempoEpisodio > 0) return tempoEpisodio;

        return genero;
    }
}
