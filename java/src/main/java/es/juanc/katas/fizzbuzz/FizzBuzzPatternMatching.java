package es.juanc.katas.fizzbuzz;

import java.util.function.Predicate;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

public class FizzBuzzPatternMatching {

    private static final Predicate<Number> multiple3 = n -> n.value % 3 == 0;
    private static final Predicate<Number> multiple5 = n -> n.value % 5 == 0;
    private static final Predicate<Number> multiple35 = multiple3.and(multiple5);

    public String process(Number number) {

        return Match(number).of(
                Case($(multiple35), "fizzbuzz"),
                Case($(multiple3), "fizz"),
                Case($(multiple5), "buzz"),
                Case($(), number.toString())
        );
    }
}