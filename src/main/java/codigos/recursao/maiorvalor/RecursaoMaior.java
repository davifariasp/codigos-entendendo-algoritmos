package codigos.recursao.maiorvalor;

import java.util.List;

public class RecursaoMaior {
  public static int calcular(Integer index, Integer maiorAtual, List<Integer> lista) {

    if (index == lista.size()) {
      return maiorAtual;
    }

    if (lista.get(index) > maiorAtual) {
      maiorAtual = lista.get(index);
    }

    return calcular(index + 1, maiorAtual, lista);
  }
}
