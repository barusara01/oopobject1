package Vazifa

import Yandex_vazifa.Order
import java.util.*
import kotlin.collections.ArrayList

class Interfice:Myinterface {
    val list=ArrayList<Odam>()
    val input=Scanner(System.`in`)
    override fun addUser() {
        println("id:")
        val id = input.nextInt()
        println("ism:")
        val input1= Scanner(System.`in`)
        val name = input1.nextLine()
        println("familiya:")
        val input2= Scanner(System.`in`)
        val familiya = input2.nextLine()
        val odam = Odam(id,name,familiya)
        list.add(odam)
    }

    override fun showUser() {
        for(i in 0 until list.size){
            println("${list[i]}")
        }
    }

    override fun delateUser() {
        for(i in 0 until list.size){
            println("$i ->${list[i]}")
        }
        println("kaysi birini ochirasiz:")
        val del_name=input.nextInt()
        list.removeAt(del_name)
        println("ochirildi")

    }

    override fun editUser() {
        for(i in 0 until list.size){
            println("$i ->${list[i]}")
        }

        println("ozgartirmoqchi bolganingizni raqamini yozing:")
        val input_del = input.nextInt()
            list.removeAt(input_del)
            println("id:")
            val id = input.nextInt()
            println("ism:")
            val input1= Scanner(System.`in`)
            val name = input1.nextLine()
            println("familiya:")
            val input2= Scanner(System.`in`)
            val familiya = input2.nextLine()
            val odam = Odam(id,name,familiya)
            list.add(odam)

    }

    override fun searchUser() {
        for(i in 0 until list.size){
            var b=("$i ->${list[i]}")
            println("kidiroyatgan odamingizni idsini yozing:")
            val kidiruv = input.nextInt()
            if (kidiruv==i){
                println("$b")

            }
        }

    }
}