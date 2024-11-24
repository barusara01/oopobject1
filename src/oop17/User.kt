package oop17

//Singleton birmata obyekt olib hohlagan joyda ishlatsa boladigon ifoda--object
//companion object - bu classning ichidagi object

//fun main(){
//    Person.person.name="Asrorbek"
//    Person.person.age=18
//    println(Person.person)
//}
//class Person(){
//    var name:String?=null
//    var age:Int?=null
//    companion object{
//        val person = Person()
//    }
//
//    override fun toString(): String {
//        return "Person(name=$name, age=$age)"
//    }
//
//
//}


fun main(){
    val str="Kotlin"
    println(str.qirqish(0,4))

    val i = 45
    println(i.qoshish(5))
}
fun String.qirqish(a:Int,b:Int):String{
    return  this.substring(a,b)
}
fun Int.qoshish(a:Int):Int{
    return this+a
}