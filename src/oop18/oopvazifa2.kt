fun main() {

    val list = arrayListOf(kata(1, 42, 33))
    var sum = 0

    for (i in list.indices) {
        if (list[i] > sum) {
            sum = list[i]
        }
    }

    println(sum)
}
fun kata(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)
}
