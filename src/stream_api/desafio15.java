package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class desafio15 {
  public static void main(String[] args) {
    // Verifique se a lista contém pelo menos um número negativo
    List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> lista2 = Arrays.asList(1, -2, 3, 4, 5, 6, 7, -8, 9, 10, 5, -4, 3);

    Consumer<Integer> numerosNegativos = n -> {
      if (n < 0)
        System.out.println(n + " é negativo");
    };

    List<Integer> listaDeNegativos1 = lista1.stream().filter(n -> n < 0).toList();
    // List<Integer> listaDeNegativos2 = lista2.stream().filter(n -> n <
    // 0).toList();

    System.out.println("Lista 1: ");
    System.out.println(listaDeNegativos1);

    System.out.println("Lista 2: ");
    lista2.stream().forEach(numerosNegativos);
  }
}
