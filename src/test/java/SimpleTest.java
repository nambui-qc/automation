import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest2 {

    // =========================================================
    // ====================== PASSED ===========================
    // ======================= 20 CASES ========================
    // =========================================================

    @Test
    @DisplayName("PASS - Verify addition")
    void testAddition() {
        int result = 7 + 8;
        assertEquals(15, result, "7 + 8 should equal 15");
    }

    @Test
    @DisplayName("PASS - Verify subtraction")
    void testSubtraction() {
        int result = 50 - 15;
        assertEquals(35, result, "50 - 15 should equal 35");
    }

    @Test
    @DisplayName("PASS - Verify multiplication")
    void testMultiplication() {
        int result = 6 * 7;
        assertEquals(42, result, "6 * 7 should equal 42");
    }

    @Test
    @DisplayName("PASS - Verify integer division")
    void testDivision() {
        int result = 36 / 6;
        assertEquals(6, result, "36 / 6 should equal 6");
    }

    @Test
    @DisplayName("PASS - Verify positive number")
    void testPositiveNumber() {
        int number = 250;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number")
    void testNegativeNumber() {
        int number = -42;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty")
    void testStringNotEmpty() {
        String text = "QualityCheck";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality")
    void testStringEqualitySuccess() {
        String actual = "QualityCheck";
        assertEquals("QualityCheck", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text")
    void testStringContains() {
        String text = "QualityCheck Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text")
    void testStringStartsWith() {
        String text = "QualityCheck";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size")
    void testListSizeSuccess() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element")
    void testListContainsSuccess() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertTrue(items.contains("TestNG"),
                "The list should contain TestNG");
    }

    @Test
    @DisplayName("PASS - Verify first list element")
    void testFirstListElement() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertEquals("Python", items.get(0),
                "The first element should be Python");
    }

    @Test
    @DisplayName("PASS - Verify last list element")
    void testLastListElement() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertEquals("Cypress", items.get(2),
                "The last element should be Cypress");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition")
    void testBooleanTrue() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition")
    void testBooleanFalse() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null")
    void testNotNull() {
        String value = "QualityCheck";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object")
    void testIsNull() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length")
    void testArrayLength() {
        int[] numbers = {5, 15, 25, 35, 45};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element")
    void testArrayElement() {
        int[] numbers = {5, 15, 25};

        assertEquals(15, numbers[1],
                "The second element should be 15");
    }


    // =========================================================
    // ======================= FAILED =========================
    // ======================= 20 CASES ========================
    // =========================================================

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value")
    void testAdditionWrongExpected() {
        int result = 7 + 8;

        assertEquals(20, result,
                "7 + 8 should equal 20");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value")
    void testSubtractionWrongExpected() {
        int result = 50 - 15;

        assertEquals(50, result,
                "50 - 15 should equal 50");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value")
    void testMultiplicationWrongExpected() {
        int result = 6 * 7;

        assertEquals(50, result,
                "6 * 7 should equal 50");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value")
    void testDivisionWrongExpected() {
        int result = 36 / 6;

        assertEquals(10, result,
                "36 / 6 should equal 10");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect")
    void testPositiveNumberFailed() {
        int number = -8;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect")
    void testNegativeNumberFailed() {
        int number = 30;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch")
    void testStringEqualityFailed() {
        String actual = "QualityCheck";

        assertEquals("World",
                actual,
                "The string should be World");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text")
    void testStringContainsFailed() {
        String text = "QualityCheck";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text")
    void testStringStartsWithFailed() {
        String text = "QualityCheck";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text")
    void testStringEndsWithFailed() {
        String text = "QualityCheck";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size")
    void testListSizeFailed() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element")
    void testListContainsFailed() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element")
    void testFirstListElementFailed() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element")
    void testLastListElementFailed() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG",
                "Cypress"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition")
    void testBooleanTrueFailed() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition")
    void testBooleanFalseFailed() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null")
    void testNotNullFailed() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null")
    void testIsNullFailed() {
        String value = "QualityCheck";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length")
    void testArrayLengthFailed() {
        int[] numbers = {5, 15, 25, 35, 45};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element")
    void testArrayElementFailed() {
        int[] numbers = {5, 15, 25};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }


    // =========================================================
    // ======================== ERROR ==========================
    // ======================= 10 CASES ========================
    // =========================================================
    //
    // These tests throw runtime exceptions before reaching
    // the assertion.
    //
    // =========================================================

    @Test
    @DisplayName("ERROR - Division by zero")
    void testDivisionByZero() {
        int result = 25 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException")
    void testNullPointerAccess() {
        String text = null;

        int length = text.length();

        assertEquals(10, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds")
    void testArrayOutOfBounds() {
        int[] numbers = {5, 15, 25};

        int value = numbers[8];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format")
    void testInvalidNumberFormat() {
        String value = "QualityCheck";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds")
    void testListIndexOutOfBounds() {
        List<String> items = Arrays.asList(
                "Python",
                "TestNG"
        );

        String item = items.get(9);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size")
    void testNegativeArraySize() {
        int size = -12;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds")
    void testStringIndexOutOfBounds() {
        String text = "TestNG";

        char character = text.charAt(20);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list")
    void testRemoveFromEmptyList() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access")
    void testInvalidArrayAccess() {
        String[] tools = {
                "TestNG",
                "Cypress",
                "Postman"
        };

        String tool = tools[15];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value")
    void testInvalidArithmeticOperation() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }
}
