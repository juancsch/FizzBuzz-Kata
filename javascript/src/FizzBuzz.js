const { Number } = require('./Number')
const { rules } = require('./rules')

exports.FizzBuzz = function () {
    return fizzbuzz(rules)
}

const fizzbuzz = rules => num => {

    const number = Number.of(num)
    const rulesResult = check(rules, number)
    return rulesResult ? rulesResult : number.value()
}

function check (rules, number) {
    return rules.map(ruleFor => ruleFor(number))
                .filter(r => r !== '')[0]
}
