package _5eApp

data class Spells(
    val name:String,
    val source:String,
    val page:Int,
    val isSrd:Boolean,
    val isBasicRule:Boolean,
    val level:Int,
    val range:Range
)
