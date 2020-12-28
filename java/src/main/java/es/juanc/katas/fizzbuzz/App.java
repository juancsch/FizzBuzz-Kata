package es.juanc.katas.fizzbuzz;

import java.util.logging.Logger;

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

        log.info("Hello world!!");
    }
}
