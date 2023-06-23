package com.example.task2

fun main() {
    val i: Int = 28
    println(i)

    val i5: String = i.toString()
    println(i5)

    val numberOfHire = 5
    val numberOfManager = 2
    println("In Mobile Tech Solutions, there is $numberOfHire new hire" + " and $numberOfManager managers")

    compareNewHireAndManagers(8,2)

    WhenToGoToWork("Sunday")

    // Loops and Array
    val school = arrayOf("Cherlan", "Mark", "Guirand")
    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }


    // Testing some loops
    var students = 0
    while (students < 50) {
        students++
    }
    println("$students students in the classroom\n")

    do {
        students--
    } while (students > 50)
    println("$students students in the classroom\n")

    repeat(4) {
        println("A fish is swimming")
    }

}

fun compareNewHireAndManagers(numberOfHire:Int,numberOfManager:Int){
    if (numberOfHire > numberOfManager) {
        println("There are more new hire than managers")
    } else {
        println("There are more managers than new hire or as equal managers as new hire")
    }

}


fun WhenToGoToWork(currentDay: String){
    when (currentDay) {
        "Monday"  -> println("Today is Monday, you gotta go to work")
        "Tuesday" -> println("Today is Tuesday, you gotta go to work!")
        "Wednesday" -> println("Today is Wednesday, you gotta go to work!")
        "Thursday" -> println("Today is Thursday, you gotta go to work!")
        "Friday" -> println("Today is Friday, you gotta go to work!")
        "Saturday" -> println("Today is Saturday, you gotta go to work!")
        else -> println("That's Sunday, you can take a rest Mr Chick fil A!")
    }
}


