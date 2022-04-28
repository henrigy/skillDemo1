import org.junit.*;
import static org.junit.Assert.*;

public class DemoTest {
    //Test fails
    @Test
    public void testProduct(){
        assertEquals(7, Demo.product(2, 3));
    }
}
