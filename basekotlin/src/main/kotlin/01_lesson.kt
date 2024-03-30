import kotlin.math.PI
import kotlin.math.pow

fun main(){
    val name = "Влад"
    var greeting = "HI"
    var years = 14
//    println("$greeting меня зовут $name мне $years")


    /*
    арифмитические действия
     */

    var num = 23

    num = num + 4
    num += 4
    num -= 4
    num /= 2
    num *= 5
//    println(num)

    var radius = 7
    var S = PI * radius * radius
    var S2 = PI.toInt()  * radius * radius
    var radiusD: Double = 7.0
//    var S3 = PI.toInt()  * radius.pow(2)
    println(S2)



    /*
    Циклы

    var list = listOf("Иван1", "Иван2", "Иван3")
    for (item in list)
        println(item)

    var friends = listOf("Иван1","Иван2", "Иван3")
    for (item in friends){
        if (item != "Иван2")
        println(item)
    }


    for (i in name)
        println(i)



    for(i in 1..10 step 2)
        println(i)


    for (x in 10 downTo 0)
        println(x)
    println("поехали")*/

    /*var x = 1


    while (x <= 100){
        if ( x % 2 == 0)
            println(x)
        x++

    }*/



    var x = 100


    while (x >= 0){
        if ( x % 2 == 0)
            println(x)
        x--

    }













}




