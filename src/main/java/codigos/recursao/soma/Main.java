package codigos.recursao.soma;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = List.of(2, 4, 6);
        System.out.println(RecursaoSoma.calcular(0, lista));
    }
}
