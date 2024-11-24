package Harakat

import java.util.Scanner

class Proyekt_ish: Intelekt {
    val proyekt = ArrayList<Proyekt_inter>()
    val input = Scanner(System.`in`)
    override fun kelish() {
        println("Tashkenga hush kelibsiz")
        val javob1=input.next()
        println("Yotoq hona una togringizda")
        val taksis=input.next()
        println("Shark otelimizga hush kelibsiz kanaka nomer olasizmi:")
        val otel=input.next()
        println(uyolish_mebel())

    }

    override fun uyolish_mebel() {
            println("Undan aval:ismingizni,familiyangizni,nomeringizni,emailingizni kiriting")
            val input1=Scanner(System.`in`)
            val malumot=input1.next()
                println("Bizda yevro honalarimiz bor ular odiy va vip larga bolinadi:")
                val hona1=input.next()
                println("Odiy honamiz 1haftaga-1milion, 1oyga-15milion")
                println("Vip honalarimiz faqat 1oyga yoki 1yilga beriladi: 1oy-25milion, 1yil-100milion ")
                val hona2=input.next()
                println()
                if (hona2=="Odiy 1hafta"){
                    println("Hozir mana 113honani kaliti ")
                }
                if(hona2=="Odiy 1oy"){
                    println("Mana 175honani kaliti")
                }
                if(hona2=="Vip 1oy"){
                    println("Mana 121honani kaliti")
                }
                if (hona2=="Vip 1yil") {
                    println("Mana 200honani kaliti")
                }
            }


    override fun okish_gaplashish() {
        println("hali kod yozilmadi")
    }

    override fun ish() {
        println("name...")
        val ism=input.next()
        println("familiya...")
        val familya=input.next()
        println("nomer...")
        val nomer=input.nextInt()
        println("email...")
        val email=input.next()
        val pro=Proyekt_inter(ism,familya,nomer,email)
        proyekt.add(pro)
        println("Siz bizga togri keldingiz dushanbadan kech komey 08:00 ishxonada bolin")
    }

    override fun oz_ish() {
        println("hali kod yozilmadi")
    }

    override fun moshina() {
        println("hali kod yozilmadi")
    }
}