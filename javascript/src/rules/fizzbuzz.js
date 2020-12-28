
exports.fizzbuzzRule = function fizzbuzzRule (number) {
    return number.divBy(5) && number.divBy(3) ?
        'fizzbuzz' : '';
}
