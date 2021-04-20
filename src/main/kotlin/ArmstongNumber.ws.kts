val number = 371
var originalNumber = 0
var remainder = 0
var result = 0

originalNumber = number

while (originalNumber != 0) {
    remainder = originalNumber % 10
    result += remainder.toBigInteger().pow(3).toInt()
    originalNumber /= 10
}

if (number == result) {
    println("$number is armstrong number.")
} else {
    println("$number is not armstrong number.")
}
