package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio4 {
  public static void main(String[] args) {
    // Remova todos os valores ímpares
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    numeros.stream()
        .filter(n -> n % 2 == 0 || n == 0)
        .forEach(System.out::println);
  }
}
