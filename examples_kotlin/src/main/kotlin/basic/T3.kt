package basic

/**
 * 练习：继承，final与abstract
 */

abstract class Console2() {
    abstract var price: Int
    abstract var name: String
    abstract fun sell()
}

open class Xbox(): Console2() {
    override var price = 399
    override var name = "Xbox"
    override fun sell() {
        println("A $name is sold by $$price")
    }
}

/**
 * 打上final标签，不能作为父类
 */
class XboxOne(): Xbox() {
    final override var price = 299
    final override var name = "XboxOne"
}


fun main() {
    var x1 = XboxOne()
    x1.sell()
}