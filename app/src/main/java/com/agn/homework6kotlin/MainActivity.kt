package com.agn.homework6kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vowelsConsonants()
        createWords()
        numbersВescending()
        evenOdd()
        matematic()
    }

    //work num 5
    private fun matematic() {
        val numbers = arrayOf(12001, 29384, 12384, 909345, 34289, 1, 2, 3)
        var even = 0
        var odd = 1
        for (number in numbers){
            if (number %2 == 0){
                even += number
            } else {
                odd *= number
            }
        }
        println("Сумма четных $even")
        println("Сумма не четных $odd")
    }

    //work num 4
    private fun evenOdd() {
        val numbers = arrayOf(10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38)
        println("четные")
        for (number in numbers) {
            if (number % 2 == 0) {
                println(number)
            }
        }
        println("не четные")
        for (number in numbers) {
            if (number % 2 != 0) {
                println(number)
            }
        }
    }
}

//work num 3
    private fun numbersВescending() {
        val num = arrayOf(9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233)
        num.sortDescending()
        println("по убыванию :")
        for (nums in num){
            println(nums)
        }
    }

// work num 2
    private fun createWords() {
        val wordsSecond = arrayOf("java", "kotlin", "python"
            , "javascript", "nodejs", "go"
            , "react", "react native", "swift")
        val vowelsSecond = mutableListOf<Char>()
        for (wordSecond in wordsSecond){
            for (charSecond in wordSecond.toLowerCase()){
                if (charSecond in "aeiou"){
                    if (!vowelsSecond.contains(charSecond)){
                        vowelsSecond.add(charSecond)
                    }
                }
            }
        }
        println("Гласные : ${vowelsSecond.joinToString()}")

        val consonants = mutableListOf<Char>()
        for (wordSecond in wordsSecond){
            for (charSecond in wordSecond.toLowerCase()){
                if (charSecond !in "aeiou"){
                    if (!consonants.contains(charSecond)){
                        consonants.add(charSecond)
                    }
                }
            }
        }
        println("Согласные : ${consonants.joinToString()}")

        val wordFirst = "android"
        val wordSecond = "kotlin"
        println("Два слова про андроид : $wordFirst $wordSecond")
    }

// work num 1
    private fun vowelsConsonants() {
        val words = arrayOf("переменная","функция",
            "метод","аргумент","параметр"
            ,"привязка","длина","высота","размер")
        val vowels = mutableListOf<Char>()
        for (word in words){
            for (char in word.toLowerCase()){
                if (char in "аиоыу"){
                    if (!vowels.contains(char)){
                        vowels.add(char)
                    }
                }
            }
        }
        println("Гласные буквы: ${vowels.joinToString()}")

        val constants = mutableListOf<Char>()
        for (word in words){
            for (char in word.toLowerCase()){
                if (char !in "аиоыу"){
                    if (!constants.contains(char)){
                        constants.add(char)
                    }
                }
            }
        }
        println("Согласные буквы: ${constants.joinToString()}")
    }
