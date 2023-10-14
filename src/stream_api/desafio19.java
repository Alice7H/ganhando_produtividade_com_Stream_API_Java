package stream_api;

import java.util.Arrays;
import java.util.List;

public class desafio19 {
  public static void main(String[] args) {
    // Encontre a soma dos números divisíveis por 3 e 5
    List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> lista2 = Arrays.asList(1, 3, 4, 5, 9, 10, 15, 30, 45, 60);

    Integer somaDosDivisiveis1 = lista1.stream()
        .filter(n -> (n % 3 == 0 && n % 5 == 0 && n > 0))
        .reduce(0, Integer::sum);

    Integer somaDosDivisiveis2 = lista2.stream()
        .filter(n -> (n % 3 == 0 && n % 5 == 0 && n > 0))
        .reduce(0, Integer::sum);

    System.out.println("Soma da lista 1 - " + somaDosDivisiveis1);
    System.out.println("Soma da lista 2 - " + somaDosDivisiveis2);
  }
}
