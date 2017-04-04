import org.junit.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun testGetGreetings() {
        assertEquals("Hello, World!", getGreetings());
    }
}