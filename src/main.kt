/**
 * Created by sbonde3 on 9/15/18.
 */

private const val CONSTANT: Int = 3234
val hasSteed = false;
const val pubName = "Unicorn's Horn"
const val playerName = "Estragon"
val menu: List<String> = listOf("mead", "wine")
var healthpoints = 100
val isBlessed = false
var fireballCount = 0;


fun main(args: Array<String>) {

    val karma = (Math.pow(Math.random(), (110 - healthpoints) / 100.0) * 20).toInt()

    val healthStatus = when (healthpoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) "has some minor wounds but is healing quite quickly!" else "has some minor wounds."
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition!"
    }

    println(auraColor(karma))
    println("$playerName $healthStatus")
    castFireBall()
    castFireBall()
    castFireBall()

    println(inebriationStatus(castFireBall()))
}

fun auraColor(karma: Int): String = when (karma) {
    in 0..5 -> "red"
    in 6..10 -> "blue"
    in 11..15 -> "purple"
    in 16..20 -> "green"
    else -> "nothing"
}

fun castFireBall(): Int = if (fireballCount < 50) ++fireballCount else fireballCount;

fun inebriationStatus(inebriationLevel: Int) = when (inebriationLevel) {
    in 1..10 -> "tipsy"
    in 11..20 -> "sloshed"
    in 21..30 -> "soused"
    in 31..40 -> "stewed"
    else -> "..t0aSt3d"
}