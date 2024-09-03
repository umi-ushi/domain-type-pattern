package lab.umiushi.dtp.collection

class NonEmptyList<out T> private constructor(private val original: List<T>) : List<T> by original {

    init {
        require(original.isEmpty().not())
    }

    companion object {
        fun <T> from(original: List<T>): NonEmptyList<T> {
            return NonEmptyList(original)
        }
    }
}
