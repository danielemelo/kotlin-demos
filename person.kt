fun main(args: Array<String>) { 
    val person: Person = Person("John Doe", 32, "Married") 
    println("Name of person: " + person.name) 
    println("Age: " + person.age)
    println("Civil status: " + person.status)
    println("Resume: "+ person.toString()) //using inbuilt function of the data class  
}  
data class Person(val name: String, val age: Int, var status: String)
