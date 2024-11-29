package Vazifa

class vazifa2in {
   val ism="izatilo"
   val moshina="bugatti"
   val nomer="A123B"
   fun start(){
       println("$moshina,ni ichida$ism,moshinani nomeri$nomer")
   }
   inner class Iner(){
       fun ochish(){
           start()
           println("Aka siz moshinani pulini hali tolamadiz")
       }
   }
}
fun main(){
   val moshina=vazifa2in()
   val moshina2=moshina.Iner()
   moshina2.ochish()
}

