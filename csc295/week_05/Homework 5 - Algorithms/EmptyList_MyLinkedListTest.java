// Tyler J. Teichmann

// Import Test for testing methods.
import org.junit.Test;
// Import assertEquals for testing methods.
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;


// Public class for the Tests.
public class EmptyList_MyLinkedListTest {

    // Constant for testing adding to the list
    public final Integer TESTINTEGER = 4;

    // Annotation for test method.
    @Test
    // Test method for default constructor
    public void MyLinkedList_NoInput_CreateEmptyList() {
        // Arrange

        // Act
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Assert
        assertTrue(testList instanceof MyLinkedList);
    }

    // Annotation for test method.
    @Test
    // Test method for ToString method
    public void ToString_EmptyList_EmptyBrackets() {
        //Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertTrue("[  ]".equals(testList.toString()));
    }

    // Annotation for test method.
    @Test
    public void Head_EmptyList_HeadPointsToNull(){
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertNull(testList.Head());
    }

    // Annotation for test method.
    @Test
    public void Tail_EmptyList_TailPointsToNull() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertNull(testList.Tail());
    }

    // Annotation for test method.
    @Test
    public void Size_EmptyList_Zero() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertEquals(0, testList.Size());
    }

    // Annotation for test method.
    @Test 
    public void IsEmpty_EmptyList_True() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertTrue(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_EmptyList_NullPointerException() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.Get(5));
    }

    @Test
    // Test method for AddFront method
    public void AddFront_EmptyList_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act.
        testList.AddFront(4);

        // Assert.
        assertEquals((Integer)4, testList.Head().data);
        assertNull(testList.Head().next);
        assertNull(testList.Head().previous);

        assertEquals((Integer)4, testList.Tail().data);
        assertNull(testList.Tail().next);
        assertNull(testList.Tail().previous);

        assertEquals(1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Append_EmptyList_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act.
        testList.Append(4);

        // Assert.
        assertEquals((Integer)4, testList.Head().data);
        assertNull(testList.Head().next);
        assertNull(testList.Head().previous);

        assertEquals((Integer)4, testList.Tail().data);
        assertNull(testList.Tail().next);
        assertNull(testList.Tail().previous);

        assertEquals(1, testList.Size());    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_EmptyListWithPositiveIndex_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act.
        testList.Insert(0, 4);

        // Assert.
        assertEquals((Integer)4, testList.Head().data);
        assertNull(testList.Head().next);
        assertNull(testList.Head().previous);

        assertEquals((Integer)4, testList.Tail().data);
        assertNull(testList.Tail().next);
        assertNull(testList.Tail().previous);

        assertEquals(1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_EmptyListWithNegativeIndex_HeadAndTailPointToItemSizeIsOne() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act.
        testList.Insert(-1, 4);

        // Assert.
        assertEquals((Integer)4, testList.Head().data);
        assertNull(testList.Head().next);
        assertNull(testList.Head().previous);

        assertEquals((Integer)4, testList.Tail().data);
        assertNull(testList.Tail().next);
        assertNull(testList.Tail().previous);

        assertEquals(1, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_EmptyListWithIndexOutOfBounds_NullPointerException() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.Insert(5, 4));
        assertThrows(NullPointerException.class, () -> testList.Insert(-5, 4));
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void DeleteFront_EmptyList_NullPointerException() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.DeleteFront());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void DeleteBack_EmptyList_NullPointerException() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.DeleteBack());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void DeleteNodeBasedOnValue_EmptyList_NullPointerException() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.DeleteNodeBasedOnValue(4));
    }
}
