package br.com.dio.model.livros;

import java.util.Map;
import java.util.Objects;

public class Livro implements Comparable<Map.Entry<String, Livro>>{
    private String nome;
    private int numPaginas;

    public Livro() { }

    public Livro( String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return numPaginas == livro.numPaginas && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nome, numPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                " nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    @Override
    public int compareTo(Map.Entry<String, Livro> livro) {
        return Integer.compare(this.getNumPaginas(), livro.getValue().getNumPaginas());
    }
}
