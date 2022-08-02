package br.com.dio;

import br.com.dio.model.temperatura.Temperatura;

import java.util.*;
import java.util.stream.Stream;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        /*System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a 3ª nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();

            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: ");
        Double media = soma / notas.size();
        System.out.println(media);

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();

            if(next < 7d){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: ");
        System.out.println(notas.isEmpty());*/
        // Exercicio
        /*LinkedList<Double> novaLista = new LinkedList<>(notas);

        System.out.println(novaLista);

        System.out.println("Mostre a primeira nota da nova lista sem remove-la: " + novaLista.peekFirst());
        System.out.println(novaLista);

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + novaLista.pollFirst());
        System.out.println(novaLista);*/


        // ordenação de lista
        /*List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", "preto", 18));
            add(new Gato("Simba", "tigrado", 6));
            add(new Gato("Jon", "amarelo", 12));
        }};

        System.out.println(gatos.toString());

        System.out.println("Ordem de Inserção");
        System.out.println(gatos.toString());

        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos.toString());

        System.out.println("Ordem natural (Nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem Idade");
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordem Cor");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem Nome/Cor/Idade");
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        System.out.println(gatos);*/

        /*List<Temperatura> listaTemperaturas = new ArrayList<>(){{
            add(new Temperatura("Janeiro", 30));
            add(new Temperatura("Fevereiro", 33));
            add(new Temperatura("Março", 27));
            add(new Temperatura("Abril", 25));
            add(new Temperatura("Maio", 18));
            add(new Temperatura("Junho", 12));
        }};

        Iterator<Temperatura> iterator = listaTemperaturas.iterator();
        int somaTemperaturas = 0;
        while(iterator.hasNext()) {
            int temp = iterator.next().getTemperatura();

            somaTemperaturas += temp;
        }
        int mediaTemperaturas = somaTemperaturas / listaTemperaturas.size();

        Iterator<Temperatura> iterator1 = listaTemperaturas.iterator();
        while (iterator1.hasNext()) {
            int temp1 = iterator1.next().getTemperatura();

            if(temp1 < mediaTemperaturas) listaTemperaturas.remove(iterator1);
        }

        System.out.println(listaTemperaturas.toString());*/

        List<String> listaRespostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda as perguntas com S ou N: ");
        System.out.println("Você telefonou para a vitima? ");
        listaRespostas.add(scan.next());
        System.out.println("Você esteve com a vitima? ");
        listaRespostas.add(scan.next());
        System.out.println("Você mora perto da vitima? ");
        listaRespostas.add(scan.next());
        System.out.println("Você devia para a vitima? ");
        listaRespostas.add(scan.next());
        System.out.println("Você já trabalhou para a vitima? ");
        listaRespostas.add(scan.next());

        Iterator<String> iterator = listaRespostas.iterator();
        int respostasAfirmativas = 0;
        while(iterator.hasNext()) {
            String resposta = iterator.next();
            if(resposta.toUpperCase().equals("S")) {
                respostasAfirmativas++;
            }
        }

        switch (respostasAfirmativas) {
            case 2:
                System.out.println("Suspeito");
                break;

            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;

            case 5:
                System.out.println("Assassina");
                break;

            default:
                System.out.println("Inocente");
                break;
        }

    }
}

