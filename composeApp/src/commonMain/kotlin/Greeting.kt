class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello Ismail \n" +
                "${platform.name}!"
    }
}