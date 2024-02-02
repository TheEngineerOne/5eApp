package lib5e.Spells

enum class DurationType{
    TIMED{
        override fun toString():String{
            return "timed"
        }
    },
    INSTANT{
        override fun toString():String{
            return "instant"
        }
    },
    ROUND{
        override fun toString():String{
            return "round"
        }
    },
    MINUTE{
        override fun toString():String{
            return "minute"
        }
    },
    HOUR{
        override fun toString():String{
            return "hour"
        }
    },
    DAY{
        override fun toString():String{
            return "day"
        }
    };
}

data class Duration(
    val durationType:DurationType,
    val amount:Int? = null,
    val duration:Duration? = null,
    val concentration:Boolean? = null
)
