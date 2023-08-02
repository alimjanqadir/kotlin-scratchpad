val functionLiteralWithReceiver: Int.(Int) -> Int = { other -> plus(other) }
val anonymousFunctionWithReceiver = fun Int.(other: Int): Int = this + other

class HTML {
    fun body() {
        println("Body")
    }
}

fun html(init: HTML.()->Unit): HTML {
    var html = HTML()
    html.init()
    return html
}

html {
    body()
}