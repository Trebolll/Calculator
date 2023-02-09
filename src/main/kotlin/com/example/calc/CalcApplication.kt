package com.example.calc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


var result:String = ""
var a: Double = 0.0;
var b: Double = 0.0;
var sing: String =""


@SpringBootApplication
class CalcApplication

fun main(args: Array<String>) {
    runApplication<CalcApplication>(*args)

    readNumbers()
    readSymbol()
    countNumbers()
}

fun readNumbers() {
    println("Введите два числа - >")
    b = readLine()!!.toDouble();
    a = readLine()!!.toDouble();
}

fun readSymbol() {
    println("Введите знак операции - >")
    sing = readLine()!!
}

fun countNumbers() {
    when (sing) {
        "+" -> result = (a + b).toString()
        "-" -> result = (a - b).toString()
        "*" -> result = (a * b).toString()
        "/" -> result = (a / b).toString()
    }
    println("Ответ -> $result")
}
