package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio8 {
  public static void main(String[] args) {
    // Somar os dígitos de todos os números da lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    Integer somaDigitos = numeros.stream()
        .map(s -> s.toString())
        .flatMapToInt(String::chars)
        .mapToObj(o -> Character.valueOf((char) o))
        .mapToInt(c -> Integer.parseInt(c.toString()))
        .sum();

    System.out.println(somaDigitos);
  }
}
