package oop18

fun main() {
    val list = arrayOf(kata(5,7, 4))
    var sum = 0
    for (i in list.indices) {
        if (list[i] > sum) {
            sum = list[i]

        }

    }
    println(sum)
}
fun <T>kata(a:T,b:T,c:T) {
//    println(kata(11,22,33))
}





