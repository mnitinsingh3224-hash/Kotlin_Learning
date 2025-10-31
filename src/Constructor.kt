
// Primiary Constructor
class Car(var model:String,var colour:String) {

    fun res() {

        println("the model of the car is: $model and the colour of the model is: $colour")
    }
}

fun main() {
    val car1 = Car("hunai","blue")
    car1.res()

    val bus1 = Bus("rajasthan roadways")
    bus1.horn()

    val jeep1 = Jeep("thar")
}

// Secondary Constructor

class Bus {
    var colour: String = ""                 //Global variable
    var model: String = ""                  //Global variable

    constructor(model: String) {
        this.model = "ultra"
        this.colour = "red"
    }

    fun horn() {
        println("the model of the bus : $model and the colour of the bus : $colour")
    }
}


// init block

class Jeep(val model: String){
    var formatmodel = ""

    init {
        formatmodel = model.uppercase()
        println(formatmodel)
    }

}
