package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio5 {
  public static void main(String[] args) {
    // Calcule a média dos números maiores que 5
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    Double media = numeros.stream()
        .filter(n -> n > 5)
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElseThrow();

    System.out.println("Média " + media);
  }
}
