package com.example.mobile_coding.model

class Cat
constructor(
    name: String,
    age: Int) : Animal(name, age
) {
    override fun communicate(): String {
        return "MEOW"
    }

    override fun getInfo(): String {
        return "${communicate()} I'm a cat ${super.getInfo()}"
    }
    fun setCat(num: Int){
        when(num){
            1-> { breed  = "British"; color = "Grey"}
            2 -> { breed  = "Russian"; color = "Blue"}
            else -> { breed  = "Egypt"; color = "Pink"}
        }
    }
}