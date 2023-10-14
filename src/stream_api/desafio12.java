package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio12 {
  public static void main(String[] args) {
    // Encontre o produto de todos os números da lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    Integer produtoDosNumeros = numeros.stream().reduce(1, (a, b) -> a * b);
    System.out.println(produtoDosNumeros);
  }
}
