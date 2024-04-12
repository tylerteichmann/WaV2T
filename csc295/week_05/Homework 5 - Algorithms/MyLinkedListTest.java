// Tyler J. Teichmann

// Import Test for testing methods.
import org.junit.Test;
// Import assertEquals for testing methods.
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;


// Public class for the Tests.
public class MyLinkedListTest {

    public final Integer[] TESTARRAY = new Integer[]{0, 1, 2, 3};
    public final Integer TESTINTEGER = 4;

    // Annotation for test method.
    @Test
    // Test method for ToString method
    public void ToString_SingleElementList_BracketsWithElement() {
        //Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>();
        testList.AddFront(0);

        // Act - Assert.
        assertTrue("[ 0 ]".equals(testList.toString()));
    }

    // Annotation for test method.
    @Test
    // Test method for non default constructor
    public void MyLinkedList_Input_CreateFilledList() {
        // Arrange

        // Act
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Assert
        assertTrue(testList instanceof MyLinkedList);
        assertTrue(testList.toString().equals("[ 0, 1, 2, 3 ]"));
    }

    // Annotation for test method.
    @Test
    // Test Method for Head method
    public void Head_FilledList_HeadPointsToFirstElement(){
        // Arrange
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals((Integer)0, testList.Head().data);
        assertEquals((Integer)1, testList.Head().next.data);
        assertNull(testList.Head().previous);
    }

    // Annotation for test method.
    @Test
    // Test method for Tail method.
    public void Tail_EmptyList_TailPointsToLastElement() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals((Integer)3, testList.Tail().data);
        assertNull(testList.Tail().next);
        assertEquals((Integer)2, testList.Tail().previous.data);
    }

    // Annotation for test method.
    @Test
    // Test method for size method.
    public void Size_FilledList_Four() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals(4, testList.Size());
    }

    // Annotation for test method.
    @Test 
    // Test Method for IsEmpty Method.
    public void IsEmpty_FilledList_False() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertFalse(testList.IsEmpty());
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_PositiveIndex_FirstElementInList() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals(TESTARRAY[0], testList.Get(0));
        assertEquals(TESTARRAY[1], testList.Get(1));
        assertEquals(TESTARRAY[2], testList.Get(2));
        assertEquals(TESTARRAY[3], testList.Get(3));
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_NegativeIndex_LastElementInList() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertEquals(TESTARRAY[0], testList.Get(-4));
        assertEquals(TESTARRAY[1], testList.Get(-3));
        assertEquals(TESTARRAY[2], testList.Get(-2));
        assertEquals(TESTARRAY[3], testList.Get(-1));
    }

    // Annotation for test method.
    @Test
    // Test method for Get method.
    public void Get_IndexOutOfBounds_NullPointerException() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.Get(10));
    }

    // Annotation for test method.
    @Test
    // Test method for AddFront method
    public void AddFront_FilledList_HeadPointsToNewItemTailPointsToLastItemSizeIsCorrect() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act.
        testList.AddFront(TESTINTEGER);

        // Assert.
        assertEquals(TESTINTEGER, testList.Head().data);
        assertEquals(TESTARRAY[0], testList.Head().next.data);
        assertNull(testList.Head().previous);

        assertEquals(TESTARRAY[3], testList.Tail().data);
        assertNull(testList.Tail().next);
        assertEquals(TESTARRAY[2], testList.Tail().previous.data);

        assertEquals(5, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for AddFront method
    public void Append_FilledList_TailPointsToNewItemHeadPointsToFirstItemSizeIsCorrect() {
        // Arrange.
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act.
        testList.Append(TESTINTEGER);

        // Assert.
        assertEquals(TESTARRAY[0], testList.Head().data);
        assertEquals(TESTARRAY[1], testList.Head().next.data);
        assertNull(testList.Head().previous);

        assertEquals(TESTINTEGER, testList.Tail().data);
        assertNull(testList.Tail().next);
        assertEquals(TESTARRAY[3], testList.Tail().previous.data);

        assertEquals(5, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_FilledListWithPositiveIndex_GetIndexHeadAndTailPointToCorrectItemSizeIsCorrect() {
        // Arrange.
        int insertIndex = 1;
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act.
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert.
        assertEquals(TESTINTEGER, testList.Get(insertIndex));

        assertEquals(TESTARRAY[0], testList.Head().data);
        assertEquals(TESTINTEGER, testList.Head().next.data);
        assertNull(testList.Head().previous);

        assertEquals(TESTARRAY[3], testList.Tail().data);
        assertNull(testList.Tail().next);
        assertEquals(TESTARRAY[2], testList.Tail().previous.data);

        assertEquals(5, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_FilledListWithNegativeIndex_GetIndexHeadAndTailPointToCorrectItemSizeIsCorrect() {
        // Arrange.
        int insertIndex = -2;
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act.
        testList.Insert(insertIndex, TESTINTEGER);

        // Assert.
        assertEquals(TESTINTEGER, testList.Get(insertIndex));

        assertEquals(TESTARRAY[0], testList.Head().data);
        assertEquals(TESTARRAY[1], testList.Head().next.data);
        assertNull(testList.Head().previous);

        assertEquals(TESTARRAY[3], testList.Tail().data);
        assertNull(testList.Tail().next);
        assertEquals(TESTINTEGER, testList.Tail().previous.data);

        assertEquals(5, testList.Size());
    }

    // Annotation for test method.
    @Test
    // Test method for Append method.
    public void Insert_EmptyListWithIndexOutOfBounds_NullPointerException() {
        // Arrange.
        int insertIndex = 10;
        MyLinkedList<Integer> testList = new MyLinkedList<Integer>(TESTARRAY);

        // Act - Assert.
        assertThrows(NullPointerException.class, () -> testList.Insert(insertIndex, 4));
        assertThrows(NullPointerException.class, () -> testList.Insert(-insertIndex, 4));
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
