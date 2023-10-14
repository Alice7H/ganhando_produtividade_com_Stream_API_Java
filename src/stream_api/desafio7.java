package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class desafio7 {
  public static void main(String[] args) {
    // Encontrar o segundo número maior da lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Integer segundoMaior = numeros.stream()
        .sorted(Comparator.reverseOrder())
        .toList()
        .get(1);
    System.out.println("Segundo maior número: " + segundoMaior);
  }
}
