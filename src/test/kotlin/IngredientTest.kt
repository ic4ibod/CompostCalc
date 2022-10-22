import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class IngredientTest {

    private val myCompost: FLSC = FLSC()

    @Test
    fun `test the compost has a nitrogen value` () {
        myCompost.nitrogen = 0.015
        val expected = 0.015
        assertEquals(expected, myCompost.nitrogen)
    }

}