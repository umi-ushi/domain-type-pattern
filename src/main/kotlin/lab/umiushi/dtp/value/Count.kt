package lab.umiushi.dtp.value

@JvmInline
value class Count(private val value: Int) {

    operator fun plus(other: Count): Count {
        return Count(this.value + other.value)
    }

}