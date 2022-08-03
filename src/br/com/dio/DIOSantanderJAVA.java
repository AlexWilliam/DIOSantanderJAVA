package br.com.dio;

import br.com.dio.exceptions.DivisaoNaoExataException;
import br.com.dio.exceptions.ErroAritmeticoException;
import br.com.dio.exceptions.IndexNaoEncotradoException;

import javax.swing.*;
import java.util.Arrays;

public class DIOSantanderJAVA {

    public static void main(String[] args) {

        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for(int i = 0; i < denominador.length; i++){
            try{
                if(denominador[i] == 0){
                    throw new ErroAritmeticoException(numerador[i], denominador[i]);
                }

                if(numerador.length <= i){
                    throw new IndexNaoEncotradoException(i, "numerador");
                }

                if(denominador.length <= i){
                    throw new IndexNaoEncotradoException(i, "denominador");
                }

                if(numerador[i] % denominador[i] != 0) {
                    throw new DivisaoNaoExataException(numerador[i], denominador[i]);
                }

                int resultado = numerador[i] / denominador[i];
            }catch(DivisaoNaoExataException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (ErroAritmeticoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }catch (IndexNaoEncotradoException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }
}