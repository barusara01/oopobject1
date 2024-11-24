package Vazifa

fun main(){
    val sw=zin.Mash()
    sw.malumot()
    val ws=Phone.Samsung()
    ws.malumot2()
}
class zin(){
    val brand = "Laseti"
    class Mash(){
        val name="Laseti"
        fun malumot()= println(name)
    }
}

class Phone(){
    val brand="Samsung"
    class Samsung(){
        val versiya="Samsung 22ultra"
        fun malumot2()= println(versiya)
    }
}