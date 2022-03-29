import java.io.File
import java.nio.file.Files;
import java.nio.file.Paths;

// Create DTOs (POJOs/POCOs)
//data class Rect(val width: Int, val height: Int)
//val rect = Rect(400, 400)
//println(rect)

// Filter a list
//val list = listOf(-1, 2, 9, 0, 1, 2, 3, 4, 6)
//val positives = list.filter { it > 0 }
//println(positives)
// Check the presence of an element in a collection
//if(-1 in list) println("yes")

// Traverse a map or a list of pairs
//val map = mapOf(1 to 'a', 2 to 'b')
//for((k, v) in map)
//	println("$k, $v")


// Iterate over a range
//for(i in 0..100) print("$i ") // closed ranged  include 100
//println()
//
//for(i in 0 until 100) print("$i ") // half closed ranges not include 100
//println()

//for(i in 0..10 step 2) print("$i ") 
//print("\n")
//
//for(i in 10 downTo 0) print("$i ")
//print("\n")

// Create a singleton
//object Singleton {
//	val myVal = 1
//}
//println("myVal: ${Singleton.myVal}")

// Instantiate an abstract class
//abstract class Animal {
//	abstract fun  move()
//	abstract fun eat()
//}
//val animal = object: Animal() {
//	override fun move() = println("Moving")
//	override fun eat() = println("Eating")
//}
//animal.move()
//animal.eat()

// If not null shorthand
val files = File(".").listFiles()
println(files?.size)

// If not null else shorthand
//var nullable: String? = null
//println(nullable?.uppercase() ?: "null");
//nullable = "test"
//println(nullable?.uppercase() ?: "null");

// Get possibly absent value from collection
//var fruits = listOf("Apple", "Pear", "Banana")
//println(fruits.firstOrNull());
//fruits = listOf();
//println(fruits.firstOrNull());

// Execute if not null
//var z: List<Int>? = listOf(0, 1, 2, 3, 4) 
//z?.let {
//	val evenNumbers = it.filter { n -> n % 2 == 0 }
//	println("even numbers: $evenNumbers")
//}

// Map nullable value if not null
//fun transform(): Int? = null;
//var numbers: List<Int>? = listOf(1, 3, 5, 7)
//val evenNumber = numbers?.let { transform() } ?: 2
//println("even: $evenNumber");


// Return on when statement
//fun reply(args: String) =  when(args) {
//	"a" -> "b"
//	else -> "c"
//}
//println(reply("b"))

// Try catch expression
//val trycatch = try {
//	1 / 1
//} catch(e: ArithmeticException) {
//	e.printStackTrace()
//}
//println(trycatch);

// Call multiple methods on an object instance
//class Person {
//	fun walk(){}
//	fun eat(){}
//	fun sleep(){}
//}
//val person = Person()
//with(person) {
//	walk()
//	eat()
//	sleep()
//}

// Builder style usage of methods that return unit
//fun arrayOfMinusOnes(size: Int): IntArray = IntArray(size).apply{fill(-1)}
//arrayOfMinusOnes(10).forEach{ print(it) }
//println();

// Configure properties of an object (apply)
//class Car() {
//	var color: Int? = null
//	var brand: String? = null
//	override fun toString() = "$color and $brand"
//}
//val car = Car().apply {
//	color = 0;
//	brand = "demo"
//}
//println(car);

// Java 7's try with resources
//val stream = Files.newInputStream(Paths.get("KotlinIdioms.kts"))
//stream.buffered().reader().use { reader -> println(reader.readText())}

// Nullable boolean
var bool: Boolean? = null
if(bool == true) {
	println("Condition true")
} else {
	println("Condition false")
}


