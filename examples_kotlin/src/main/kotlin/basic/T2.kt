package basic

/**
 * 练习：继承，open
 */
open class Console() {
    var price: Int = 0
    var name: String = ""
    open fun sell() {
        println("A $name is sold by $$price!")
    }
}

class PS4(price_p: Int): Console() {
    init {
        price = price_p
        name = "Playstation4"
    }
}

fun main() {
    var ps4 = PS4(299);
    ps4.sell()
}