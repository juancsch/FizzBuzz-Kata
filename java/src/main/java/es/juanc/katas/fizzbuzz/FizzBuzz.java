package es.juanc.katas.fizzbuzz;

import io.vavr.Function1;
import io.vavr.control.Option;

import static io.vavr.control.Option.none;
import static io.vavr.control.Option.some;

public class FizzBuzz {

    private static final Function1<FBNumber, Option<String>> multiple3 = n -> n.value % 3 == 0 ? some("fizz") : none();
    private static final Function1<FBNumber, Option<String>> multiple5 = n -> n.value % 5 == 0 ? some("buzz") : none();

    public String process(FBNumber number) {
        return "";
//        return multiple3
//                .andThen(multiple5)
//                .apply(number);
    }
}
