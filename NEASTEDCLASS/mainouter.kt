package NEASTEDCLASS

//fun main(args: Array<String>) {
//    val outer = Outer()
//    println(outer.a)
//
//    val nested = Outer.Neasted()
//    println(nested.b)
//    println(nested.callme())
//}

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.wtf)

    val nested = outer.Inner()
    println(nested.wth)
    println(nested.callme())
}