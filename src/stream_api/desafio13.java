package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio13 {
  public static void main(String[] args) {
    // Filtrar os números que estão dentro de um intervalo específico (5 e 10)
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> numerosEmIntervalo = numeros.stream()
        .filter(n -> (n >= 5 && n <= 10))
        .sorted()
        .toList();
    System.out.println(numerosEmIntervalo);
  }
}
