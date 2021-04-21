data class Time(internal var hours: Int, internal var minutes: Int, internal var seconds: Int)

val start = Time(12, 30, 10)
val end = Time(15, 30, 10)
val difference = difference(start, end)

print("${start.hours}  ${start.minutes} ${start.seconds}")
print("${end.hours}  ${end.minutes} ${end.seconds}")
print("${difference.hours}  ${difference.minutes} ${difference.seconds}")

fun difference(start: Time, end: Time): Time {
    val difference = Time(0, 0, 0)
    if (end.seconds > start.seconds) {
        start.minutes -= 1
        start.seconds += 60
    }

    difference.seconds = start.seconds - end.seconds
    if (end.minutes > start.minutes) {
        start.hours -= 1
        start.minutes += 60
    }

    difference.minutes = start.minutes - end.minutes
    difference.hours = start.hours - end.hours

    return difference
}