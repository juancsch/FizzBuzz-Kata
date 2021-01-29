package es.juanc.katas.fizzbuzz;

import java.util.logging.Logger;

import io.vavr.collection.List;

// @Log
public class App {

    private static Logger log;
    static {
        System.setProperty("java.util.logging.config.file",
                App.class.getClassLoader().getResource("logging.properties").getFile()
        );
        log = Logger.getLogger(App.class.getName());
    }

    public static void main(String[] args) {

        var fb = new FizzBuzz();

        List.range(1, 6)
            .forEach(n -> log.info(
                    fb.process(FBNumber.of(n))
            ));
    }
}
