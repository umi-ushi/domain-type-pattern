package lab.umiushi.dtp.business

import java.math.BigDecimal

@JvmInline
value class Amount(val value: BigDecimal)

enum class Currency {
    USD,
    JPY,
    EUR,
    HKD,
    // etc...
}

class Money(private val amount: Amount, private val currency: Currency) {
    fun add(other: Money): Money {
        require(other.currency == this.currency)
        return Money(Amount(this.amount.value.add(other.amount.value)), this.currency)
    }
}
