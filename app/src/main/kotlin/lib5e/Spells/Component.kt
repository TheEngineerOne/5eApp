package lib5e.Spells

data class Material(
    val material:String,
    val cost:Int? = null
)

data class Components(
    val verbal:Boolean? = null,
    val somatic:Boolean? = null,
    val material:Material? = null
)
