package br.com.dio.model.livros;

import java.util.Comparator;
import java.util.Map;

public class CompareNumPagina  implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return Integer.compare(livro1.getValue().getNumPaginas(), livro2.getValue().getNumPaginas());
    }
}
