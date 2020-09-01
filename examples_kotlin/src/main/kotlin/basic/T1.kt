package basic

fun main() {
    f3()
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