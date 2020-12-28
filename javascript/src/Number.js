
exports.Number = {
    of (number) {
        return {
            divBy (divisor) {
                return number % divisor === 0
            },
            value () {
                return number
            }
        }
    }
}
