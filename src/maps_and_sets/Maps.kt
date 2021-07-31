package maps_and_sets

fun main() {
    val yearOfBirth = mapOf("Anna" to 1990, "Tumi" to 2001, "Jide" to 1999)

    val namesAndScores = mutableMapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)

    val pairs = hashMapOf("Anna" to 1990, "Tumi" to 2001, "Jide" to 1999)
    println(pairs)

    // Adding pairs to maps
    val bobData = mutableMapOf("name" to "Bob", "profession" to "CardPlayer", "country" to "USA")
    bobData.put("state", "CA")
    println(bobData)
    // there are other ways this can be done though

    // Iterating through maps
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    // Hash values
    println("Yooo".hashCode())
    println(1.hashCode())
    println(1.hashCode())
    println(false.hashCode())
    println(false.hashCode())

    // A given value would always have a particular hash value no matter how many times, it is enquired

    // Updating values
    bobData.put("name", "Bobby")

    // Removing pairs
    bobData.remove("country")

    println(bobData)
}