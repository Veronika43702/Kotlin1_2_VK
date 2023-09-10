fun main() {

    // 1. расчет комиссии
    val amount = 4799
    val comission = 0.75 / 100
    val comissionSum = if (comission * amount > 35) {comission * amount} else {35}
    println(comissionSum)

    // 2. Вывод слов после числительного
    val likes = 111
    val personText = if (likes % 10 == 1 && likes.toString().substring(likes.toString().length-2,likes.toString().length) != "11" ){
       "человеку"
    } else {
        "людям"
    }
    println("Понравилось " + likes + " " + personText)

    // 3. Меломан
    val sum: Int = 100000
    val regularCustomer = true
    val regularCustomerPercentage = 0.01

    val discountFix = 100
    val discountPercentage = 0.05
    val discountPercentageSum = sum * discountPercentage

    val sumWithCounts = if (sum >= 0 && sum <= 1000){
        sum
    } else if (sum > 1000 && sum <= 10000){
        sum - discountFix
    } else {
        sum - discountPercentageSum
    }

    val totalSum = if (regularCustomer == true){
        Math.round(sumWithCounts.toDouble() - sumWithCounts.toDouble() * regularCustomerPercentage).toInt()
    }
    else {
        Math.round(sumWithCounts.toDouble())
    }

    println(totalSum)
}