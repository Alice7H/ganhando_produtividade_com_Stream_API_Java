package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio11 {
  public static void main(String[] args) {
    // Encontre a soma dos quadrados de todos os números da lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Integer soma = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
    System.out.println("A soma dos quadrados dos números da lista: " + soma);
  }

}
