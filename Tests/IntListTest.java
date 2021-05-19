import org.junit.Test;
import static org.junit.Assert.*;

public class IntListTest {
    
    //Test that the function addInteger in Sortable adds to the list
    @Test
    public void testIntAdd() {
        Sortable.addInteger(5);
        Sortable.addInteger(8);
        Sortable.addInteger(2);
        assertEquals("Adding 3 integers to the list", 3, Sortable.sizeOfIntList());
    }

    //Test that the function sizeOfIntList in Sortable returns a list size
    @Test
    public void testOfIntSize() {
        assertEquals("Checking size of the integer list", 0, Sortable.sizeOfIntList());
    }
}
