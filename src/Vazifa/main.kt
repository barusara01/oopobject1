package Vazifa

import java.util.Scanner

fun main(){
    val input =Scanner(System.`in`)
    val service=Interfice()
    while (true){
        println("1->addUser, 2->showUser, 3->editUser, 4->delateUser, 5->searchUser")
        when(input.nextInt()){
            1->service.addUser()
            2->service.showUser()
            3->service.editUser()
            4->service.delateUser()
            5->service.searchUser()
        }
    }
}