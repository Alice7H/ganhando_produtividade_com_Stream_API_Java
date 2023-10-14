package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class desafio14 {
  public static void main(String[] args) {
    // Encontre o maior número primo da lista
    Predicate<Integer> numerosPrimos = (n) -> (n >= 2 && (n == 2 || n == 3 || n % 3 != 0 && n % 2 == 1));

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    Integer maiorPrimo = numeros.stream()
        .filter(numerosPrimos)
        .sorted(Comparator.reverseOrder())
        .toList()
        .get(0);
    System.out.println("O maior número primo da lista: " + maiorPrimo);
  }
}
