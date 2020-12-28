package es.juanc.katas.fizzbuzz;

import io.vavr.Function1;
import io.vavr.collection.List;
import io.vavr.control.Option;

import static io.vavr.control.Option.none;
import static io.vavr.control.Option.some;

public class FizzBuzz {

    private static final Function1<Number, Option<String>> multiple3 = n -> n.value % 3 == 0 ? some("fizz") : none();
    private static final Function1<Number, Option<String>> multiple5 = n -> n.value % 5 == 0 ? some("buzz") : none();

    public String process(Number number) {
        return pipeline(
            multiple3,
            multiple5
        ).apply(number);
    }

    private Function1<Number, String> pipeline(Function1<Number, Option<String>> ...rules) {
        return number -> List.of(rules)
                             .map(rule -> rule.apply(number))
                             .filter(output -> !output.isEmpty())
                             .fold(none(), (acc, ele) -> acc.map(v -> v + ele.get())
                                                            .orElse(ele)
                             ).getOrElse(number.toString());
    }
}
