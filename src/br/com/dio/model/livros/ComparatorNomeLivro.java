package br.com.dio.model.livros;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}
