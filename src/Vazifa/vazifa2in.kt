package Vazifa

//class vazifa2in {
//    val ism="izatilo"
//    val moshina="bugatti"
//    val nomer="A123B"
//    fun start(){
//        println("$moshina,ni ichida$ism,moshinani nomeri$nomer")
//    }
//    inner class Iner(){
//        fun ochish(){
//            start()
//            println("Aka siz moshinani pulini hali tolamadiz")
//        }
//    }
//}
//fun main(){
//    val moshina=vazifa2in()
//    val moshina2=moshina.Iner()
//    moshina2.ochish()
//}

class Orl(){
    val ism:String="sherali"
    fun salom(){
        println("Salom")
    }
    inner class Nested{
        val yosh:Int=15
        fun chikarish(){
            println("ismingiz:$ism va yoshingiz:$yosh")
            salom()
        }

    }
}
fun main(){
    val b=Orl()
    val a=b.Nested()
    a.chikarish()
}