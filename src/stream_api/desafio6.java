package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class desafio6 {
  public static void main(String[] args) {
    // Verificar se a lista contém algum número maior que 10
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    List<Integer> outraLista = Arrays.asList(1, 2, 9, 10, 15, 14, 13);

    System.out.println("Números maiores que 10:");
    numeros.stream().filter(n -> n > 10).forEach(System.out::println);

    List<Integer> maioresQueDez = outraLista.stream().filter(n -> n > 10).toList();
    System.out.println("Números maiores que 10:" + maioresQueDez);

    Consumer<Integer> verificaNumeros = (n) -> {
      if (n > 10)
        System.out.println(n + " maior que 10");
    };
    outraLista.stream().forEach(verificaNumeros);
  }
}
