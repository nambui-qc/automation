import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    // =========================================================
    // ====================== PASSED ===========================
    // ======================= 20 CASES ========================
    // =========================================================

    @Test
    @DisplayName("PASS - Verify basic addition")
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("PASS - Verify subtraction")
    void testSubtraction() {
        int result = 20 - 5;
        assertEquals(15, result, "20 - 5 should equal 15");
    }

    @Test
    @DisplayName("PASS - Verify multiplication")
    void testMultiplication() {
        int result = 4 * 5;
        assertEquals(20, result, "4 * 5 should equal 20");
    }

    @Test
    @DisplayName("PASS - Verify integer division")
    void testDivision() {
        int result = 20 / 4;
        assertEquals(5, result, "20 / 4 should equal 5");
    }

    @Test
    @DisplayName("PASS - Verify positive number")
    void testPositiveNumber() {
        int number = 100;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number")
    void testNegativeNumber() {
        int number = -10;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty")
    void testStringNotEmpty() {
        String text = "AgileTest";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality")
    void testStringEqualitySuccess() {
        String actual = "AgileTest";
        assertEquals("AgileTest", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text")
    void testStringContains() {
        String text = "AgileTest Practice";
        assertTrue(text.contains("Test"),
                "The string should contain 'Test'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text")
    void testStringStartsWith() {
        String text = "AgileTest";
        assertTrue(text.startsWith("Agile"),
                "The string should start with 'Agile'");
    }

    @Test
    @DisplayName("PASS - Verify list size")
    void testListSizeSuccess() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element")
    void testListContainsSuccess() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertTrue(items.contains("JUnit"),
                "The list should contain JUnit");
    }

    @Test
    @DisplayName("PASS - Verify first list element")
    void testFirstListElement() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertEquals("Java", items.get(0),
                "The first element should be Java");
    }

    @Test
    @DisplayName("PASS - Verify last list element")
    void testLastListElement() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertEquals("Selenium", items.get(2),
                "The last element should be Selenium");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition")
    void testBooleanTrue() {
        boolean isLearning = true;

        assertTrue(isLearning,
                "The learning status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition")
    void testBooleanFalse() {
        boolean isCompleted = false;

        assertFalse(isCompleted,
                "The completed status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null")
    void testNotNull() {
        String value = "AgileTest";

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
        int[] numbers = {10, 20, 30, 40};

        assertEquals(4, numbers.length,
                "The array should contain 4 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element")
    void testArrayElement() {
        int[] numbers = {10, 20, 30};

        assertEquals(20, numbers[1],
                "The second element should be 20");
    }


    // =========================================================
    // ======================= FAILED =========================
    // ======================= 20 CASES ========================
    // =========================================================

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value")
    void testAdditionWrongExpected() {
        int result = 2 + 3;

        assertEquals(6, result,
                "2 + 3 should equal 6");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value")
    void testSubtractionWrongExpected() {
        int result = 20 - 5;

        assertEquals(20, result,
                "20 - 5 should equal 20");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value")
    void testMultiplicationWrongExpected() {
        int result = 4 * 5;

        assertEquals(25, result,
                "4 * 5 should equal 25");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value")
    void testDivisionWrongExpected() {
        int result = 20 / 4;

        assertEquals(10, result,
                "20 / 4 should equal 10");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect")
    void testPositiveNumberFailed() {
        int number = -5;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect")
    void testNegativeNumberFailed() {
        int number = 10;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch")
    void testStringEqualityFailed() {
        String actual = "AgileTest";

        assertEquals("Hello",
                actual,
                "The string should be Hello");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text")
    void testStringContainsFailed() {
        String text = "AgileTest";

        assertTrue(text.contains("Selenium"),
                "The string should contain Selenium");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text")
    void testStringStartsWithFailed() {
        String text = "AgileTest";

        assertTrue(text.startsWith("JUnit"),
                "The string should start with JUnit");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text")
    void testStringEndsWithFailed() {
        String text = "AgileTest";

        assertTrue(text.endsWith("Java"),
                "The string should end with Java");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size")
    void testListSizeFailed() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element")
    void testListContainsFailed() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertTrue(items.contains("Python"),
                "The list should contain Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element")
    void testFirstListElementFailed() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertEquals("Python", items.get(0),
                "The first element should be Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element")
    void testLastListElementFailed() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit",
                "Selenium"
        );

        assertEquals("Python", items.get(2),
                "The last element should be Python");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition")
    void testBooleanTrueFailed() {
        boolean isLearning = false;

        assertTrue(isLearning,
                "The learning status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition")
    void testBooleanFalseFailed() {
        boolean isCompleted = true;

        assertFalse(isCompleted,
                "The completed status should be false");
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
        String value = "AgileTest";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length")
    void testArrayLengthFailed() {
        int[] numbers = {10, 20, 30, 40};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element")
    void testArrayElementFailed() {
        int[] numbers = {10, 20, 30};

        assertEquals(50, numbers[1],
                "The second element should be 50");
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
        int result = 10 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException")
    void testNullPointerAccess() {
        String text = null;

        int length = text.length();

        assertEquals(5, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds")
    void testArrayOutOfBounds() {
        int[] numbers = {10, 20, 30};

        int value = numbers[5];

        assertEquals(20, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format")
    void testInvalidNumberFormat() {
        String value = "AgileTest";

        int number = Integer.parseInt(value);

        assertEquals(100, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds")
    void testListIndexOutOfBounds() {
        List<String> items = Arrays.asList(
                "Java",
                "JUnit"
        );

        String item = items.get(5);

        assertEquals("Selenium", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size")
    void testNegativeArraySize() {
        int size = -5;

        int[] numbers = new int[size];

        assertEquals(5, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds")
    void testStringIndexOutOfBounds() {
        String text = "JUnit";

        char character = text.charAt(10);

        assertEquals('A', character);
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
                "JUnit",
                "Selenium",
                "Postman"
        };

        String tool = tools[10];

        assertEquals("Java", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value")
    void testInvalidArithmeticOperation() {
        int number = Integer.MAX_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }
}
