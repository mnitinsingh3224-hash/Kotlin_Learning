fun main () {

            val student1 = Student()
            student1.marks = "22"
            student1.rollNO = 22
            student1.doHomework()


    }

    class Student {
        var marks = ""
        var rollNO = 0

        fun doHomework() {
            println("marks are: $marks,  roll number is : $rollNO")
        }
    }
