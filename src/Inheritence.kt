open class GrandParentsHouse {
    var room = 5
    var matrial = "mud"

    open fun describe () {
        println("The room is $room and the material is: $matrial")
    }
}

open class ParentClassHouse : GrandParentsHouse() {
    init {
        room = 5
        matrial = "concrete"
    }

    override fun describe() {
       println("The room is $room and the material is: $matrial")
    }
}

class child (val types: String) : ParentClassHouse() {
    val type = types

    init {
        room = 6
    }

    override fun describe() {
        super.describe()
        println("The room is $room and the type is: $type")


    }
}

fun main() {
//    val grandparnets1 = GrandParentsHouse()
//    grandparnets1.describe()
//
//    val parentsHouse = ParentClassHouse()
//    parentsHouse.describe()

    val childhouse = child("small")
    childhouse.describe()
}