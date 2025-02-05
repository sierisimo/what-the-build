data class Message(
    val message: String,
)

fun main() {
    println("Hello Kotlin! (Finally)")

    Message("Hello Message").also { println(it) }
}
