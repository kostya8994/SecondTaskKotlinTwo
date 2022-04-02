fun main() {
    println("Понравилось 1 ${likesSign(1)}")
    println("Понравилось 2 ${likesSign(2)}")
    println("Понравилось 5 ${likesSign(5)}")
    println("Понравилось 10 ${likesSign(10)}")
    println("Понравилось 11 ${likesSign(11)}")
    println("Понравилось 20 ${likesSign(20)}")
    println("Понравилось 21 ${likesSign(21)}")
    println("Понравилось 36 ${likesSign(36)}")
    println("Понравилось 61 ${likesSign(61)}")
    println("Понравилось 100 ${likesSign(100)}")
    println("Понравилось 101 ${likesSign(101)}")
    println("Понравилось 10000 ${likesSign(10000)}")
    println("Понравилось 10001 ${likesSign(10001)}")
    println("Понравилось 10011 ${likesSign(10011)}")
    println("Понравилось 10101 ${likesSign(10101)}")
}
fun likesSign(likes: Int): String{
    return if (likes % 100 == 11){
        "людям"
    } else if (likes % 10 == 1){
        "человеку"
    } else{
        "людям"
    }
}