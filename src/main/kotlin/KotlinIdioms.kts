import java.io.File
// create data objects

data class Rect(val width: Int, val height: Int)
val rect = Rect(400, 400)
println(rect)

val list = listOf(-1, 2, 9, 0, 1, 2, 3, 4, 6)
val positives = list.filter {it > 0}
println(positives)

if(-1 in list) println("yes")

//val map = mapOf(1 to 'a', 2 to 'b')
//for((k, v) in map)
//	println("$k, $v")
//
//
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

object Singleton {
	val myVal = 1
}
println("myVal: ${Singleton.myVal}")

// Instantiate abstract class
abstract class Animal {
	abstract fun  move()
	abstract fun eat()
}

val animal = object: Animal() {
	override fun move() = println("Moving")
	override fun eat() = println("Eating")
}

animal.move()
animal.eat()

// if not null shorthand
val files = File(".").listFiles()
println(files?.size)

var nullable: String? = null
println(nullable?.uppercase() ?: "null");
nullable = "test"
println(nullable?.uppercase() ?: "null");

var fruits = listOf("Apple", "Pear", "Banana")
println(fruits.firstOrNull());

fruits = listOf();
println(fruits.firstOrNull());

// Execute if not null
var z: List<Int>? = listOf(0, 1, 2, 3, 4) 
z?.let {
	it.filter { n -> n % 2 == 0}
}

// Map nullable value if not null
fun transform(): Int? = null;
var numbers: List<Int>? = listOf(1, 3, 5, 7)
val evenNumber = numbers?.let { transform() } ?: 2
println("even: $evenNumber");
