package optional;

import java.util.Optional;

public class Exemplo {
  public static void main(String[] args) {

    // of(value)
    // Optional<String> optionalValue = Optional.of("Hello");
    // System.out.println(optionalValue.get());

    // ofNullable(value)
    // String nullableValue = null;
    // Optional<String> optionalValue = Optional.ofNullable(nullableValue);
    // System.out.println(optionalValue.isPresent());

    // empty();
    // Optional<String> optionalValue = Optional.empty();
    // System.out.println(optionalValue.isPresent());

    // isPresent()
    // Optional<String> optionalValue = Optional.of("Hello");
    // System.out.println(optionalValue.isPresent());

    // isEmpty()
    // Optional<String> optionalValue = Optional.ofNullable(null);
    // System.out.println(optionalValue.isEmpty());

    // get()
    // Optional<String> optionalValue = Optional.of("Hello");
    // System.out.println(optionalValue.get());

    // orElse(defaultValue)
    // Optional<String> optionalValue = Optional.ofNullable(null);
    // String result = optionalValue.orElse("Default");
    // System.out.println(result);

    // orElseGet(supplier)
    // Optional<String> optionalValue = Optional.ofNullable(null);
    // String result = optionalValue.orElseGet(() -> "Value from Supplier");
    // System.out.println(result);

    // orElseThrow(exceptionSupplier)
    // Optional<String> optionalValue = Optional.ofNullable(null);
    // String result = optionalValue.orElseThrow(() -> new RuntimeException("Value
    // not present"));
    // System.out.println(result);

    // ifPresent(consumer)
    Optional<String> optionalValue = Optional.of("Hello");
    optionalValue.ifPresent(value -> System.out.println("Valor presente: " + value));
  }
}
