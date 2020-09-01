package basic

class T1(val name: String){
    init {
        println("T1 object created!")
    }
    fun print() {
        println("The name is $name")
    }
}
fun main() {
    f11()
//    println(f8("zsh"))
}

fun f11() {
    var t = T1("zsh")
    t.print()
    println(t.name)
}

fun f10() {
    for(i in 5 downTo 1 step 2){
        println(i)
    }
}

fun f9() {
    for(i in 1..3) {
        println(i)
    }
}

fun f8(str: String): String {
    return "Param is $str"
}

fun f7(): String {
    return "this is function seven!"
}

fun f6(): Int {
    return 6;
}

fun f5() {
    var myArr = arrayOf(1, 2, 3)
    println(myArr[1])
    println(myArr.size)
    println("myArr have ${myArr.size} items")
}

fun f1() {
    println("This is function1")
}

fun f2() {
    var a = 0
    while(a < 5) {
        println("当前a的值为: $a")
        a++;
    }
}

fun f3() {
    var a = 5;
    var b = 3;
    if(a < b) {
        println("a")
    }else {
        println("b")
    }
}

fun f4() {
    var a: Int = 3;
    a = 128
    println(a)
}