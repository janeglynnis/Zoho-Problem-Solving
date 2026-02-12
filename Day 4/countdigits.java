function countDigit(n)
{
    if (n === 0)
        return 1;

    let count = 0;
    while (n !== 0) {
        n = Math.floor(n / 10);
        ++count;
    }
    return count;
}

let n = 58964;
console.log(countDigit(n));
