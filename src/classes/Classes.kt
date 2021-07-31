package classes

import java.util.*

class Classes {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // Instances as references
            val john = Person(firstName = "John", lastName = "Ojo")
            println(john.fullName)
            val homeOwner = john
            println(homeOwner.lastName)
            john.lastName = "Mark"
            println(homeOwner.lastName)
            println(john === homeOwner)


            var imposters = (0..100).map {
                Person(firstName = "John", lastName = "Appleseed")
            }

            println(imposters.map {
                it.firstName == "John" && it.lastName == "Appleseed"
            }.contains(true))

            println(imposters.contains(john))

            val mutableImposters = mutableListOf<Person>()
            mutableImposters.addAll(imposters)
            mutableImposters.add(Random().nextInt(5), john)
            println(mutableImposters.contains(john))


            // Destructuring declarations
            val joshuaGrades = StudentData("Joshua", "Banji", 93)
            val (firstName, lastName, id) = joshuaGrades
            println(firstName)
            println(lastName)
            println(id)
        }
    }

}

class Person(var firstName: String, var lastName: String) {
    val fullName get() = "$firstName $lastName"
}

data class StudentData(
    var firstName: String, var lastName: String, var id: Int
)