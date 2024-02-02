package lib5e.Spells

enum class RangeType{
    POINT{
        override fun toString():String{
            return "point"
        }
    },
    RADIUS{
        override fun toString():String{
            return "radius"
        }
    },
    SPHERE{
        override fun toString():String{
            return "sphere"
        }
    },
    CONE{
        override fun toString():String{
            return "cone"
        }
    },
    LINE{
        override fun toString():String{
            return "line"
        }
    },
    CUBE{
        override fun toString():String{
            return "cube"
        }
    },
    HEMISPHERE{
        override fun toString():String{
            return "hemisphere"
        }
    },
    SPECIAL{
        override fun toString():String{
            return "special"
        }
    };

}

enum class DistanceType{
    SELF{
        override fun toString():String{
            return "self"
        }
    },
    TOUCH{
        override fun toString():String{
            return "touch"
        }
    },
    FEET{
        override fun toString():String{
            return "feet"
        }
    },
    MILES{
        override fun toString():String{
            return "miles"
        }
    },
    UNLIMITED{
        override fun toString():String{
            return "unlimited"
        }
    },
    SIGHT{
        override fun toString():String{
            return "sight"
        }
    };
}


data class Distance(
    val type:DistanceType,
    val distance:Int? = null
)

data class Range(
    val type:RangeType,
    val distance:Distance
)
