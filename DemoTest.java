import org.junit.*;
import static org.junit.Assert.*;

public class DemoTest {
    //Test passes
    @Test
    public void testProduct(){
        assertEquals(6, Demo.product(2, 3));
    }
}
