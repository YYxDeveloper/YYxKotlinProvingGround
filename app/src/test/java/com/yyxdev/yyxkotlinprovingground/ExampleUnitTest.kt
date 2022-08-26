package com.yyxdev.yyxkotlinprovingground

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun tryKotlin_createClass(){
        open class Shape

        class Rectangle(var height: Double, var length: Double): Shape() {
            var perimeter = (height + length) * 2
        }
        val rectangle = Rectangle(5.0, 2.0)
//        println("The perimeter is ${rectangle.perimeter}")

    }
    @Test
    fun tryKotlin_forLoop(){
        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices){
            println("yyx::: ${items[index]}")
        }

        // items 寫法
//        for (item in items) {
//            println(item)
//        }
    }
    enum class Color {
        RED, GREEN, BLUE
    }
    @Test
    fun try_When(){
        // equal switch
        val theColor = Color.RED
        when (theColor) {
            Color.RED -> println("::::red") // no branches for GREEN and BLUE
            else -> println("not red") // 'else' is required
        }
    }
    @Test
    fun try_Array(){
        // https://louis383.medium.com/kotlin-when-e383d642ac79
        val number = (1..7).random()

        when (number) {
            1 -> println("Number is 1")
            2 -> println("Number is 2")
            3 -> {
                repeat(number) { index ->
                    println("$index = print this line three times.")
                }
            }
            else -> println("Other")
        }
    }
    enum class CurrencyType(val chineseName: String,
                            val simpleExRate: Double) {
        USD("美元", 30.0),
        CNY("人民幣", 4.5),
        JPY("日圓", 0.3),
        AUD("澳幣", 20.0),
        TWD("臺幣", 1.0)
    }
    @Test
    fun try_enum(){
        class  CurrentAcount(val id:String, val type: CurrencyType, val balance: Double)

        val ac1 = CurrentAcount("1",CurrencyType.USD, 3027.5)
        val ac2 = CurrentAcount("2", CurrencyType.CNY, 1800.5)
        val ac3 = CurrentAcount("3",CurrencyType.JPY,499.2)

        val  accounts = listOf<CurrentAcount>(ac1, ac2, ac3)
        for (ac in accounts) {
            var info = "::::"
            info += "幣別：${ac.type.chineseName}\n"
            info += "餘額：${ac.balance}\n"
            info += "換算臺幣：${ac.balance * ac.type.simpleExRate}\n"

            println(info)
        }
    }
}