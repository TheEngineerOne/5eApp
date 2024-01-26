package _5eApp

data class Spells(
    //TODO : implement constructor
    var name:String,
    var source:String,
    var page:Int,
    var isSrd:Boolean,
    var isBasicRule:Boolean,
    var level:Int,
    val range:Range
)
