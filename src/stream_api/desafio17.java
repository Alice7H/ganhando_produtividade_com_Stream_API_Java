package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio17 {
  public static void main(String[] args) {
    // Filtrar os números primos da lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    numeros.stream()
        .filter(n -> (n >= 2 && (n == 2 || n == 3 || n % 3 != 0 && n % 2 == 1)))
        .forEach(System.out::println);

  }
}
