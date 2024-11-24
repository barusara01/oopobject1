package oop18

fun main(){
    println( kosh<Int>(1,3))
}

fun <t>kosh(son:t,son2:t): Int {
    return son.toString().toInt()+son2.toString().toInt()

}