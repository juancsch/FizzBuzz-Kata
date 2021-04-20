
describe('FizBuzz feature', () => {

	it.each([
		[1, '1'],
		[3, 'fizz'],
		[5, 'buzz'],
		[6, 'fizz'],
		[10, 'buzz'],
		[15, 'fizzbuzz']
	])('should retry string representation of number: %s', (num: number, expectedResult: string) => {

		const actualResult = fizzBuzz(num)

		expect(actualResult).toEqual(expectedResult)
	})
})

// type DivisibleRule = (n: number) => boolean

// function fizzBuzz (num: number): string {
//
// 	const isDiv3 = n => n % 3 === 0
// 	const isDiv5 = n => n % 5 === 0
// 	const isDiv3And5 = n => isDiv3(n) && isDiv5(n)
//
// 	let result = num.toString()
//
// 	if (isDiv3(num)) result = 'fizz'
// 	if (isDiv5(num)) result = 'buzz'
// 	if (isDiv3And5(num)) result = 'fizzbuzz'
//
// 	return result
// }

function fizzBuzz (num: number): string {

	const number = num.toString()
	const getProcessed = (res, val) => val === num.toString() ? res : val

	return [
		n => n % 3 === 0 ? 'fizz' : number,
		n => n % 5 === 0 ? 'buzz' : number,
		n => n % 3 === 0 && n % 5 === 0 ? 'fizzbuzz' : number
	]
	.map(divRule => divRule(num))
	.reduce(getProcessed, number)
}
