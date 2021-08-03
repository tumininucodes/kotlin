package objects

class Object {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            println("Omo")

            val marie = Student(1, "Marie", "Curie")
            val mark = Student(2, "Mark", "David")
            val joshua = Student(3, "Joshua", "Faith")

            StudentRepository.addStudent(marie)
            StudentRepository.addStudent(mark)
            StudentRepository.addStudent(joshua)

            StudentRepository.listAllStudents()
        }
    }
}

// Singleton use case

data class Student(val id: Int, val firstName: String, val lastName: String) {
    var fullName = "$lastName, $firstName"
}

object StudentRepository {
    val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        allStudents.add(student)
    }

    fun removeStudent(student: Student) {
        allStudents.remove(student)
    }

    fun listAllStudents() {
        allStudents.forEach {
            println(it.fullName)
        }
    }
}

// Namespace for constants use case

object JsonKeys {
    const val JSON_KEY_ID = "id"
    const val JSON_KEY_FIRSTNAME = "first_name"
    const val JSON_KEY_LASTNAME = "last_name"
}

// Companion object use case

class Scientist private constructor() {

}