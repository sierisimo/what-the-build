fun main() {
    Message(message = "Hello printer ;)").also {
        printer(it)
    }
}
