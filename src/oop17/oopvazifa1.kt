package oop17


fun main(){
    oopvazifa1.son.a=11
    oopvazifa1.son.b=23
    println(oopvazifa1.son)
}

class oopvazifa1{
    var a:Int?=null
    var b:Int?=null
    companion object {
        val son=oopvazifa1()
    }

}