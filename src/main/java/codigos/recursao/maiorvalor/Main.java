package codigos.recursao.maiorvalor;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = List.of(2, 7, 8, 10, 11, 22);

        System.out.println(RecursaoMaior.calcular(0, lista.get(0), lista));
    }
}
