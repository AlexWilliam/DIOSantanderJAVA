package br.com.dio;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DIOSantanderJAVA {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        //numerosAleatorios.stream().forEach(s -> System.out.println(s));
        //numerosAleatorios.forEach(s -> System.out.println(s));
        //numerosAleatorios.forEach(System.out::println);

        /*numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

        /*numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        // Numeros pares maiores que 2
        /*List<Integer> listaNova = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        listaNova.forEach(System.out::println);*/

        // Média dos numeros na lista
        /*numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);*/

        // remove os numeros impares
        List<Integer> listaNova2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        listaNova2.removeIf(i -> i % 2 != 0);
        listaNova2.forEach(System.out::println);
    }
}