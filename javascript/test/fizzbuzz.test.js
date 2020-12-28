/*
 * FizzBuzz spec:
 * dado un número devolverá dicho número si no es divisible por 3 o 5
 * dado un número devolverá fizz si es divisible por 3
 * dado un número devolverá buzz si es divisible por 5
 * dado un número devolverá fizzbuzz si es divisible por 3 o 5
 */

const { FizzBuzz } = require('../src/FizzBuzz')

function fizzBuzz (n) {
    return FizzBuzz()(n)
}

describe('FizzBuzz should', function() {

    test.each([
       [1],
       [2],
       [4],
       [8],
       [11]
    ])('return tests self number: %s', (numExpected) => {

       const actual = fizzBuzz(numExpected)
       expect(actual).toBe(numExpected)
    })

    test('return fizz when number is divisible by 3', () => {

      const actual = fizzBuzz(3)
      expect(actual).toBe('fizz')
    })

    test('return buzz when number is divisible by 5', () => {

      const actual = fizzBuzz(5)
      expect(actual).toBe('buzz')
    })

    test('return fizzbuzz when is divisible by 3 and 5', () => {

      const actual = fizzBuzz(15)
      expect(actual).toBe('fizzbuzz')
    })
})
