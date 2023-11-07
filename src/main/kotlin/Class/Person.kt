package Class

open class Person(age: Int, val firtName: String, val lastName: String) {
    init {
        check(age >= 0){
            "A assign value cannot be negative"
        }
    }

    val age: Int = age

  open  fun printName() = println("$firtName $lastName")
}