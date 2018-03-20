import org.junit.Assert.assertEquals
import org.junit.Test

class DiamondShould {
    @Test
    fun `return A for size 1`() {
        assertEquals("A", Diamond.shape(1))
    }

    @Test
    fun `return ABBA for size 2`() {
        val expectedResult =
                " A \nB B\n A "
        assertEquals(expectedResult, Diamond.shape(2))
    }

    @Test
    fun `return ABBCCBBA for size 3`() {
        val expectedResult = "  A  \n B B \nC   C\n B B \n  A  "
        assertEquals(expectedResult, Diamond.shape(3))
    }

    @Test
    fun `return ABBCCDDCCBBA for size 4`() {
        val expectedResult = "   A   \n  B B  \n C   C \nD     D\n C   C \n  B B  \n   A   "
        assertEquals(expectedResult, Diamond.shape(4))
    }

}