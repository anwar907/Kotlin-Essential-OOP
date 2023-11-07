import Class.Person
import Class.Student
import Interface.DefaultResourceProvider
import Interface.StringProvider

fun main() {
    val person: Person = Student(2023, "Kotlin", "Programming")

    println(person.age)

    person.printName()

    val provider: Any? = null

    if(provider is StringProvider){
        println("The variable was a string")
    }

    val stringProvider: StringProvider = DefaultResourceProvider()
    println(stringProvider.getString(19))

}