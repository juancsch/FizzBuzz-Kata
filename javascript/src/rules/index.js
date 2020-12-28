const { fizzRule } = require('./fizz')
const { buzzRule } = require('./buzz')
const { fizzbuzzRule } = require('./fizzbuzz')

const rules = [
    fizzbuzzRule,
    fizzRule,
    buzzRule
]

exports.rules = rules
