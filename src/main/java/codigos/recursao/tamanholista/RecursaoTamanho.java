package codigos.recursao.tamanholista;

import java.util.List;

public class RecursaoTamanho {
    public static int calcular (Integer index, List<Integer> lista){

        try {
            lista.get(index);
            return calcular(index + 1, lista);
        } catch (IndexOutOfBoundsException e) {
            return index;
        }

    }
}
