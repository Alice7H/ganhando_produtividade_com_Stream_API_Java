package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class desafio3 {
  public static void main(String[] args) {
    // Verifique se todos os números da lista são positivos
    List<Integer> numeros = Arrays.asList(1, -2, 3, 4, 5, 6, -7, 8, 9, -10, 5, 4, 3);
    Consumer<Integer> imprimirNumeroPositivo = numero -> {
      if (numero >= 0)
        System.out.println("O número " + numero + " é positivo");
    };

    numeros.stream().forEach(imprimirNumeroPositivo);
  }
}
