package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class DIOSantanderJAVA {

    public static void main(String[] args) {

        Gato gato = new Gato();

        Livro livro = new Livro("Contos Inacabados", 400);

        System.out.println(livro);

        System.out.println(gato);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a+b));*/


    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro() {}

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }
}