import java.util.*
import kotlin.collections.HashMap

fun main() {
    val str1 = Scanner(System.`in`)
    val inpString = str1.nextLine()
    if( isPanagram(inpString))
        println("$inpString is a Panagram")
    else
        println("$inpString is not a Panagram")
}

fun isPanagram(inpString: String): Boolean {
    val lowerSentence = inpString.lowercase()
    val hashMap : HashMap<Char, Int> = HashMap()
    for (i in lowerSentence.indices) {
        hashMap[lowerSentence[i]] = 1
    }
    for( i in 'a'..'z'){
        if (!hashMap.containsKey(i))
            return false
    }
    return true
}
