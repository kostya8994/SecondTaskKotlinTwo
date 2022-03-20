fun main() {
    likesSign(1)
    likesSign(2)
    likesSign(5)
    likesSign(10)
    likesSign(11)
    likesSign(20)
    likesSign(21)
    likesSign(36)
    likesSign(61)
    likesSign(100)
    likesSign(101)
    likesSign(10000)
    likesSign(10001)
    likesSign(10011)
    likesSign(10101)
}
fun likesSign(likes: Int){
    val sign = if (likes == 1){
        "человеку"
    } else if (likes % 100 == 11){
        "людям"
    } else if (likes % 10 == 1){
        "человеку"
    } else{
        "людям"
    }
    println("Понравилось $likes $sign")
}