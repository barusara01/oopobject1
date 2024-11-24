package Yandex_vazifa

import java.util.Scanner

class Myinterfice : Myinterface {
    val list=ArrayList<Order>()
    val input=Scanner(System.`in`)
    override fun takeOrder() {
        if (list.isNotEmpty()){
            for(i in 0 until list.size){
                println("$i ->${list[i]}")
            }
            println("${list.size} ->Exite")
            println("Which do you want to take:")
            val order = input.nextInt()
            if (order==list.size){
                driver()
            }else{
                list.removeAt(order)
                println("Order took!")
            }
        }else{
            println("Order list is empty")
        }

    }

    override fun giveOrder() {
        println("Phone number ...")
        val number = input.next()
        println("From ...")
        val input1=Scanner(System.`in`)
        val from = input1.nextLine()
        println("To ...")
        val input2=Scanner(System.`in`)
        val to = input2.nextLine()
        val order = Order(number,from,to)
        list.add(order)
    }

    override fun user() {
        while (true){
            println("1->Give Order, 2->Exit")
            when(input.nextInt()){
                1->{
                    giveOrder()
                }
                2->{
                    break
                }
            }
        }
    }

    override fun driver() {
        while (true){
            println("1-Take order, 2-Exite")
            when(input.nextInt()){
                1->{
                    takeOrder()
                }
                2->{
                    break
                }
            }
        }
    }

}