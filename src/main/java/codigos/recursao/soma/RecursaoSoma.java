package codigos.recursao.soma;

import java.util.List;

public class RecursaoSoma {
    public static int calcular(Integer index, List<Integer> lista){
        //caso-base
        if (index == lista.size()) {
            return 0;
        } else {
            //caso recursivo
            return lista.get(index) + calcular(index + 1, lista);
        }
    }
}
