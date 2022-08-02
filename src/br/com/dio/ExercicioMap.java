package br.com.dio;

import br.com.dio.model.livros.ComparatorNomeLivro;
import br.com.dio.model.livros.CompareNumPagina;
import br.com.dio.model.livros.Livro;

import java.util.*;

public class ExercicioMap {
    public static void main(String[] args) {

        /*System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> listaCarros = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(listaCarros.toString());
        System.out.println("\r\n");

        System.out.println("Substitua o consumo do Gol por 15,2 km/L");
        listaCarros.put("Gol", 15.2);
        System.out.println(listaCarros.toString());
        System.out.println("\r\n");

        System.out.println("Confira se o modelo Tucson está no dicionário");
        System.out.println(listaCarros.containsKey("Tucson"));
        System.out.println("\r\n");

        System.out.println("Exiba o consumo do Uno");
        System.out.println(listaCarros.get("Uno"));
        System.out.println("\r\n");

        System.out.println("Exiba os modelo adicionado");
        System.out.println(listaCarros.keySet());
        System.out.println("\r\n");

        System.out.println("Exiba o consumo dos carros");
        System.out.println(listaCarros.values());
        System.out.println("\r\n");

        System.out.println("Exiba o modelo mais economico e seu consumo");
        Double consumo = Collections.max(listaCarros.values());
        Set<Map.Entry<String, Double>> entries = listaCarros.entrySet();
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumo)){
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente + " -> " + consumo);
            }
        }
        System.out.println("\r\n");

        System.out.println("Exiba o modelo menos economico e seu consumo");
        Double consumoMenor = Collections.min(listaCarros.values());
        Set<Map.Entry<String, Double>> entries2 = listaCarros.entrySet();
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: entries2){
            if(entry.getValue().equals(consumoMenor)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " -> " + consumoMenor);
            }
        }
        System.out.println("\r\n");

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = listaCarros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("\r\n");

        System.out.println("Exiba a média dos consumos");
        System.out.println(soma / listaCarros.size());
        System.out.println("\r\n");

        System.out.println("Remova os carros com consumo igual a 15,6 km/L");
        Iterator<Double> iterator1 = listaCarros.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() == 15.6) iterator1.remove();
        }
        System.out.println(listaCarros);
        System.out.println("\r\n");

        System.out.println("Exiba os carros na ordem em que foram informados");
        Map<String, Double> listaCarros2 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(listaCarros2);
        System.out.println("\r\n");

        System.out.println("Exiba os carros ordenados por modelo");
        Map<String, Double> listaCarros3 = new TreeMap<>(listaCarros);
        System.out.println(listaCarros3);
        System.out.println("\r\n");


        System.out.println("Apague a lista de carros");
        listaCarros.clear();
        System.out.println(listaCarros);
        System.out.println("\r\n");

        System.out.println("Verifique se o Map está vazio");
        System.out.println(listaCarros.isEmpty());
        System.out.println("\r\n");*/

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> listaLivros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : listaLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n");

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> listaLivros1 = new LinkedHashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : listaLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n");

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> listaLivros2 = new TreeMap<>(listaLivros1);
        for(Map.Entry<String, Livro> livro : listaLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n");

        System.out.println("--\tOrdem alfabética nome dos livros\t--");
        Set<Map.Entry<String, Livro>> listaLivros3 = new TreeSet<>(new ComparatorNomeLivro());
        listaLivros3.addAll(listaLivros1.entrySet());
        for(Map.Entry<String, Livro> livro : listaLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n");

        System.out.println("--\tOrdem alfabética numero\t--");
        Set<Map.Entry<String, Livro>> listaLivros4 = new TreeSet<>(new CompareNumPagina());
        listaLivros4.addAll(listaLivros1.entrySet());
        for(Map.Entry<String, Livro> livro : listaLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n");

    }
}
