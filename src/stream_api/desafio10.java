package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio10 {
  public static void main(String[] args) {
    // Agrupe os valores ímpares múltiplos de 3 ou de 5
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> lista = numeros.stream()
        .filter(n -> (n % 3 == 0 || n % 5 == 0) && n % 2 != 0)
        .toList();
    System.out.println(lista);
  }
}
