package _5eApp

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
    SIGHT{
        override fun toString():String{
            return "sight"
        }
    };
}


data class Distance(val type:DistanceType, var distance:Int? = null)
data class Range(val type:RangeType, val distance:Distance)
