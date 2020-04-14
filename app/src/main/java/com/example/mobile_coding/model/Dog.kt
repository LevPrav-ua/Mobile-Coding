package com.example.mobile_coding.model

class Dog
constructor(
    name : String,
    age : Int
) : Animal(name, age) {
    override fun communicate(): String {
        return "GAV"
    }

    override fun getInfo(): String {
        return "Custom info about ME ${communicate()}, ${super.getInfo()}"
    }
    fun setDog(num: Int){
            when(num) {
                1 -> {
                    breed = "Labrador"; color = "White"
                }
                2 -> {
                    breed = "Bulldog"; color = "Brown"
                }
                else -> {
                    breed = "Sheepdog"; color = "Orange and Black"
                }
            }
    }
}