package com.vangood.lib

fun main() {
    val days = arrayOf(1,5,12,22)
    println(days[2])
    days[2]=16
    println(days[2])
    println(days.get(2))

    val dayList = listOf<Int>(1,5,88,9)
    //im-Mutable
    //dayList[2] = 15
    //dayList.add(26)
    val dayList2 = mutableListOf<Int>(5,657,87,945,5)
    dayList2.add(5)
    dayList2[2]= 15
    dayList2.removeAt(0)
    println(dayList[2])
    println(dayList2)
    println(dayList2.size)
    for (i in 0..dayList2.size-1){
        println("print "+dayList2[i])
    }
    dayList2.forEach {
        println(it)
    }
    dayList2.forEachIndexed { index, i ->
        println("$index -> $i")
    }
    println("range and list")
    for (i in dayList2){
        println(i)
    }

}

class MyClass {
}
fun hello(){
    println("Hello!")
}