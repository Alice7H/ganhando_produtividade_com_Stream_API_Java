package stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class desafio9 {
  public static void main(String[] args) {
    // Verificar se todos os números da lista são distintos (não se repetem)
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    // Set<Integer> numerosDuplicados = numeros.stream()
    // .filter(n -> Collections.frequency(numeros, n) > 1)
    // .collect(Collectors.toSet());

    Set<Integer> duplicados = new HashSet<>();
    List<Integer> valoresDuplicados = numeros.stream().filter(n -> !duplicados.add(n)).toList();

    List<Integer> numeroNaoRepetidos = numeros.stream().distinct().toList();
    System.out.println("Lista sem números repetidos: " + numeroNaoRepetidos);
    System.out.println("Números repetido(s) na lista: " + valoresDuplicados);

  }
}
