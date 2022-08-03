package br.com.dio.exceptions;

public class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(int numerador, int denominador) {
        super("A divisão de "+ numerador + " por " + denominador + " não retorna valor inteiro!");
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
