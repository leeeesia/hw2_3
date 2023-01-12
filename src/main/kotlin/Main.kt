fun main(){
    val price = 10000.0
    val discount = 100.0
    val discountPlus = 0.05
    val discountPlusCust = 0.99
    val discountStart = 1_000.0
    val discountPlusStart = 10_001.0
    val regularСustomer = true

    val result  = if (price > discountPlusStart) price - price*discountPlus else if (price> discountStart) price - discount else price
    if (!regularСustomer) println("Total Price: $result") else println("Total Price: ${result * 0.99}")
}