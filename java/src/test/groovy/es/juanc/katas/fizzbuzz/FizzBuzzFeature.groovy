package es.juanc.katas.fizzbuzz

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzFeature extends Specification {

    @Unroll
    void "Return a string representation '#outputExpected' of number #number" () {

        expect:
        def fb = new FizzBuzz()
        fb.process(Number.of(number)) == outputExpected

        where:
        number | outputExpected
        1      | '1'
        2      | '2'
        3      | 'fizz'
        5      | 'buzz'
        8      | '8'
        9      | 'fizz'
        10     | 'buzz'
        15     | 'fizzbuzz'
        30     | 'fizzbuzz'
    }
}
