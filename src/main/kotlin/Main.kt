fun main() {

    // 1. расчет комиссии
    val amount = 4799
    val comission = 0.75 / 100
    val comissionSum = if (comission * amount > 35) {comission * amount} else {35}
    println(comissionSum)

    // 2. Вывод слов после числительного
    val likes = 111
    val personText = if (((likes-1) % 10 == 0 && (likes-11) % 10 != 0) || likes == 1){
       "человеку"
    } else {
        "людям"
    }
    println("Понрасилось " + likes + " " + personText)

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
    println(sumWithCounts)

    val totalSum = if (regularCustomer == true){
        Math.round(sumWithCounts as Double - sumWithCounts * regularCustomerPercentage).toInt()
    }
    else {
        Math.round(sumWithCounts as Double)
    }

    println(totalSum)
}