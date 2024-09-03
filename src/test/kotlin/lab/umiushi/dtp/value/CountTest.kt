package lab.umiushi.dtp.value

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CountTest {
    @Test
    fun `It can add value`() {
        val actual = Count(1) + Count(100)
        assertEquals(actual, Count(101))
    }
}
