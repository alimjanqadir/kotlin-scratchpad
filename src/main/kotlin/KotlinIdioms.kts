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

for(i in 0..10 step 2) print("$i ") 
print("\n")

for(i in 10 downTo 0) print("$i ")
print("\n")
