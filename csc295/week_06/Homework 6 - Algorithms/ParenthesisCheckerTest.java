import org.junit.Test;

public class ParenthesisCheckerTest {
    @Test
    public void EmptyString_ReturnTrue() {
        // Arrange
        String testString = "";

        // Act - Assert
        assertTrue(isBalanced(testString));
    }

    @Test
    public void NoParenthesis_ReturnTrue() {

    }

}
