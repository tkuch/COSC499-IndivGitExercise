import org.junit.Test;
import static org.junit.Assert.*;

public class StringListTest {

    // Test that the function addString in Sortable adds to the list
    @Test
    public void testAdd() {
        Sortable.addString("apple");
        Sortable.addString("banana");
        Sortable.addString("carrot");
        Sortable.addString("dill");
        Sortable.addString("eggplant");
        assertEquals("Adding 5 words to list", 5, Sortable.sizeOfStringList());
    }

    // Test that the function sizeOfStringList in Sortable returns the list size
    @Test
    public void testSize() {
        assertEquals("Checking size of the list", 5, Sortable.sizeOfStringList());
    }
}
