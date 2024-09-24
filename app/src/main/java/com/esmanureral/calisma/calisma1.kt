package com.esmanureral.calisma

import java.util.concurrent.TimeUnit

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

//SİNEMA BİLETİ FİYATI
/*12 yaş ve altı çocuklar için çocuk bileti fiyatı 15 dolardır.
13 ila 60 yaş arasındaki kişiler için standart bilet fiyatı 30 dolardır. Pazartesi günleri, aynı yaş grubu için standart bilet fiyatını 25 dolara düşürün.
61 yaş ve üzeri kişiler için 20$'lık bir kıdemli bilet fiyatı. Bir sinemaseverin maksimum yaşının 100 olduğunu varsayalım.
-1 Kullanıcının yaş özellikleri dışında bir yaş girmesi durumunda fiyatın geçersiz olduğunu belirten bir değer.*/

fun main2(){
    val child=5
    val adult=28
    val senior=87

    val isMonday=true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child,isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult,isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior,isMonday)}.")
}

fun ticketPrice(age:Int,isMonday:Boolean):Int{
    return when(age){
        in 0..12->15
        in 13..60->if (isMonday) 25 else 30
        in 61..100->20
        else->-1

    }
}
/*  SİNEMA BİLETİ FİYATI ÇIKTISI:
The movie ticket price for a person aged 5 is $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20
*/

/***************************************************************************************************/

/*SICAKLIK DÖNÜŞTÜRÜCÜ
Santigrat derece Fahrenhayt'a: ° F = 9/5 (° C ) + 32
Kelvin'den Santigrat'a: ° C = K - 273.15
Fahrenheit'tan Kelvin'e: K = 5/9 (° F - 32) + 273,15
*/

fun main3(){
    printFinalTemperature(27.0,"Celsius","Fahrenheit"){ 9.0/5.0 * it +32}
    printFinalTemperature(350.0,"Kelvin","Celsius"){it-273.15}
    printFinalTemperature(10.0,"Fahrenheit","Kelvin"){5.0/9.0 * (it-32)+273.15}
}
fun printFinalTemperature(

    initialMeasurement:Double,//başlangıç sıcaklığı
    initialUnit:String,//başlangıç birimi
    finalUnit: String,//hedef birim
    conversionFormula:(Double)->Double
){
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // ikili ondalık basamak
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
/* SICAKLIK DÖNÜŞTÜRÜCÜ ÇIKTISI
27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
 */

/***************************************************************************************************/

