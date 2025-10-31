//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  println("hello world")

    var age : String = "Nitnin"
    age = "Kuku"
    println(age)
    var marks: Float= 10.0f


    val int = 23
    println("value is = $int") // use dollar to print int value.
     // int = 44   can not possible to reassign

    val num1 = 22
    val num2 = 22
    println("sum is = ${num1 + num2}")

    // Conditional Statement ->>>>>
    val day = "Morning"
    when(day) {
        "Morning" -> {println("poha mil gaya")}
        "Afternoon" -> {println("poha mil gaya")}
        "Night" -> {println("poha mil gaya")}

        else -> {
            println("kuch nhi mila")
        }
    }

    // Loops ->>>>>>>>>>>>>>
    for( i in 1..20) {
        println("the value is: $i")
    }

    // Functions->>>>>>>>>>>>>>>>
    val percentage = calculatePercentage(marks = 234, totalMarks = 455)
    println("Your perceintage is :  $percentage" )

    // Arrays ->>>>>>>>>>>>>

    var marksOfStudent= arrayOf(44,54,35,43,53)
//    println("marks of student for : ${marksOfStudent[0]}")
//    println("marks of student for : ${marksOfStudent[1]}")
//    println("marks of student for : ${marksOfStudent[2]}")
//    println("marks of student for : ${marksOfStudent[3]}")
//    println("marks of student for : ${marksOfStudent[4]}")
//
    for (marks in marksOfStudent) {
        println("marks are : $marks")
    }

}

fun calculatePercentage(marks : Int ,totalMarks : Int  ) : Float {
    return(marks.toFloat()/totalMarks) * 100
}





