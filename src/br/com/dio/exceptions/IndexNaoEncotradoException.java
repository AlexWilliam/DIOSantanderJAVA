package br.com.dio.exceptions;

public class IndexNaoEncotradoException extends Exception {

    private int index;
    private String nomeArray;

    public IndexNaoEncotradoException(int index, String array) {
        super("O índice "+index+" não foi encontrado no array "+array);
        this.index = index;
        this.nomeArray = array;
    }
}
