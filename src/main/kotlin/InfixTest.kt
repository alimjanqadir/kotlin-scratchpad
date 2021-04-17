fun main() {
    val infixTest = InfixTest()
    "" test "extension"
    infixTest test "member"
}

class InfixTest {
    infix fun test(name: String) {
        println(name)
    }
}

infix fun String.test(name: String) {
    println(name)
}
