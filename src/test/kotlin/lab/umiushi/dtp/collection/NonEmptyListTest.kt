package lab.umiushi.dtp.collection

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NonEmptyListTest {

    @Test
    fun `IllegalArgumentException should be thrown at create from empty list`() {
        assertThrows(IllegalArgumentException::class.java) {
            NonEmptyList.from(emptyList<String>())
        }
    }
}