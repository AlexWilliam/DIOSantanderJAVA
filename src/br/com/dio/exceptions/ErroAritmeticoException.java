package br.com.dio.exceptions;

public class ErroAritmeticoException extends Exception {

    private int numerador;
    private int denominador;

    public ErroAritmeticoException(int numerador, int denominador) {
        super("O numerador " + numerador + " não pode ser divido pelo denominador " + denominador);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
