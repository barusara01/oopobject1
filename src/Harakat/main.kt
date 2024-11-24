package Harakat

import Vazifa.Interfice
import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val service= Proyekt_ish()
    while (true){
        println("1->Kelish, 2->Yu va mebel olish, 3->Ripititer, 4->Ish, 5->Ish ochish,6->Moshina sotib olish")
        when(input.nextInt()){
            1->service.kelish()
            2->service.uyolish_mebel()
            3->service.okish_gaplashish()
            4->service.ish()
            5->service.oz_ish()
            6->service.moshina()
        }
    }
}