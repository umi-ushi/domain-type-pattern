package lab.umiushi.dtp.ec

interface Item {
    val price: Price
}

@JvmInline
value class Price(val value: Int)

@JvmInline
value class OrderPrice(private val amount: Int)

class BulkBuyingOrder private constructor(private val original: List<Item>) : List<Item> by original {

    init {
        require(original.size > 5)
    }

    companion object {
        fun from(original: List<Item>): BulkBuyingOrder {
            return BulkBuyingOrder(original)
        }
    }
}

private const val bulkBuyingDiscountAmount = 1000

fun discount(order: BulkBuyingOrder): OrderPrice {
    return OrderPrice(order.sumOf { it.price.value } - bulkBuyingDiscountAmount)
}