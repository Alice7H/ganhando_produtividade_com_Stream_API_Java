package stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class desafio18 {
  public static void main(String[] args) {
    // Verifique se todos os números da lista são iguais
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    Map<Integer, List<Integer>> grupos = numeros.stream()
        .collect(Collectors.groupingBy(num -> num));
    System.out.println(grupos);

    Set<Integer> numerosRepetidos = numeros.stream()
        .filter(n -> Collections.frequency(numeros, n) > 1)
        .collect(Collectors.toSet());

    System.out.println("Números que se repetem na lista: " + numerosRepetidos);
  }
}
