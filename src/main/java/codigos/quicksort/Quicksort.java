package codigos.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quicksort {
    //lista esquerda e direita iniciam vazias
    //pivo vai ser escolhido aleatoriamente
    public static List<Integer> ordenar(List<Integer> lista) {
        if(lista.size() <2){
            return lista;
        } else {
            //indice aleatorio
            Random random = new Random();
            int indiceAleatorio = random.nextInt(lista.size());

            Integer pivo = lista.get(indiceAleatorio);

            List<Integer> listaEsquerda = lista.stream().filter(x -> x < pivo).toList();
            List<Integer> listaDireita = lista.stream().filter(x -> x > pivo).toList();

            List<Integer> resultado = new ArrayList<>();

            resultado.addAll(ordenar(listaEsquerda));
            resultado.add(pivo);
            resultado.addAll(ordenar(listaDireita));

            return resultado;
        }
    }
}
