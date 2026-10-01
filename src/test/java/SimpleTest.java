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
    // ======================= 100 CASES =======================
    // =========================================================

    @Test
    @DisplayName("PASS - Verify addition (16)")
    void testAddition16() {
        int result = 22 + 38;
        assertEquals(60, result, "22 + 38 should equal 60");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (16)")
    void testSubtraction16() {
        int result = 125 - 30;
        assertEquals(95, result, "125 - 30 should equal 95");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (16)")
    void testMultiplication16() {
        int result = 21 * 22;
        assertEquals(462, result, "21 * 22 should equal 462");
    }

    @Test
    @DisplayName("PASS - Verify integer division (16)")
    void testDivision16() {
        int result = 756 / 21;
        assertEquals(36, result, "756 / 21 should equal 36");
    }

    @Test
    @DisplayName("PASS - Verify positive number (16)")
    void testPositiveNumber16() {
        int number = 265;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (16)")
    void testNegativeNumber16() {
        int number = -57;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (16)")
    void testStringNotEmpty16() {
        String text = "QualityCheck16";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (16)")
    void testStringEqualitySuccess16() {
        String actual = "QualityCheck16";
        assertEquals("QualityCheck16", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (16)")
    void testStringContains16() {
        String text = "QualityCheck16 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (16)")
    void testStringStartsWith16() {
        String text = "QualityCheck16";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (16)")
    void testListSizeSuccess16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (16)")
    void testListContainsSuccess16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertTrue(items.contains("TestNG16"),
                "The list should contain TestNG16");
    }

    @Test
    @DisplayName("PASS - Verify first list element (16)")
    void testFirstListElement16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertEquals("Python16", items.get(0),
                "The first element should be Python16");
    }

    @Test
    @DisplayName("PASS - Verify last list element (16)")
    void testLastListElement16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertEquals("Cypress16", items.get(2),
                "The last element should be Cypress16");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (16)")
    void testBooleanTrue16() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (16)")
    void testBooleanFalse16() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (16)")
    void testNotNull16() {
        String value = "QualityCheck16";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (16)")
    void testIsNull16() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (16)")
    void testArrayLength16() {
        int[] numbers = {20, 30, 40, 50, 60};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (16)")
    void testArrayElement16() {
        int[] numbers = {20, 30, 40};

        assertEquals(30, numbers[1],
                "The second element should be 30");
    }

    @Test
    @DisplayName("PASS - Verify addition (17)")
    void testAddition17() {
        int result = 23 + 40;
        assertEquals(63, result, "23 + 40 should equal 63");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (17)")
    void testSubtraction17() {
        int result = 130 - 31;
        assertEquals(99, result, "130 - 31 should equal 99");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (17)")
    void testMultiplication17() {
        int result = 22 * 23;
        assertEquals(506, result, "22 * 23 should equal 506");
    }

    @Test
    @DisplayName("PASS - Verify integer division (17)")
    void testDivision17() {
        int result = 836 / 22;
        assertEquals(38, result, "836 / 22 should equal 38");
    }

    @Test
    @DisplayName("PASS - Verify positive number (17)")
    void testPositiveNumber17() {
        int number = 266;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (17)")
    void testNegativeNumber17() {
        int number = -58;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (17)")
    void testStringNotEmpty17() {
        String text = "QualityCheck17";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (17)")
    void testStringEqualitySuccess17() {
        String actual = "QualityCheck17";
        assertEquals("QualityCheck17", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (17)")
    void testStringContains17() {
        String text = "QualityCheck17 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (17)")
    void testStringStartsWith17() {
        String text = "QualityCheck17";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (17)")
    void testListSizeSuccess17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (17)")
    void testListContainsSuccess17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertTrue(items.contains("TestNG17"),
                "The list should contain TestNG17");
    }

    @Test
    @DisplayName("PASS - Verify first list element (17)")
    void testFirstListElement17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertEquals("Python17", items.get(0),
                "The first element should be Python17");
    }

    @Test
    @DisplayName("PASS - Verify last list element (17)")
    void testLastListElement17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertEquals("Cypress17", items.get(2),
                "The last element should be Cypress17");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (17)")
    void testBooleanTrue17() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (17)")
    void testBooleanFalse17() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (17)")
    void testNotNull17() {
        String value = "QualityCheck17";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (17)")
    void testIsNull17() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (17)")
    void testArrayLength17() {
        int[] numbers = {21, 31, 41, 51, 61};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (17)")
    void testArrayElement17() {
        int[] numbers = {21, 31, 41};

        assertEquals(31, numbers[1],
                "The second element should be 31");
    }

    @Test
    @DisplayName("PASS - Verify addition (18)")
    void testAddition18() {
        int result = 24 + 42;
        assertEquals(66, result, "24 + 42 should equal 66");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (18)")
    void testSubtraction18() {
        int result = 135 - 32;
        assertEquals(103, result, "135 - 32 should equal 103");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (18)")
    void testMultiplication18() {
        int result = 23 * 24;
        assertEquals(552, result, "23 * 24 should equal 552");
    }

    @Test
    @DisplayName("PASS - Verify integer division (18)")
    void testDivision18() {
        int result = 920 / 23;
        assertEquals(40, result, "920 / 23 should equal 40");
    }

    @Test
    @DisplayName("PASS - Verify positive number (18)")
    void testPositiveNumber18() {
        int number = 267;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (18)")
    void testNegativeNumber18() {
        int number = -59;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (18)")
    void testStringNotEmpty18() {
        String text = "QualityCheck18";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (18)")
    void testStringEqualitySuccess18() {
        String actual = "QualityCheck18";
        assertEquals("QualityCheck18", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (18)")
    void testStringContains18() {
        String text = "QualityCheck18 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (18)")
    void testStringStartsWith18() {
        String text = "QualityCheck18";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (18)")
    void testListSizeSuccess18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (18)")
    void testListContainsSuccess18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertTrue(items.contains("TestNG18"),
                "The list should contain TestNG18");
    }

    @Test
    @DisplayName("PASS - Verify first list element (18)")
    void testFirstListElement18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertEquals("Python18", items.get(0),
                "The first element should be Python18");
    }

    @Test
    @DisplayName("PASS - Verify last list element (18)")
    void testLastListElement18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertEquals("Cypress18", items.get(2),
                "The last element should be Cypress18");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (18)")
    void testBooleanTrue18() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (18)")
    void testBooleanFalse18() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (18)")
    void testNotNull18() {
        String value = "QualityCheck18";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (18)")
    void testIsNull18() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (18)")
    void testArrayLength18() {
        int[] numbers = {22, 32, 42, 52, 62};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (18)")
    void testArrayElement18() {
        int[] numbers = {22, 32, 42};

        assertEquals(32, numbers[1],
                "The second element should be 32");
    }

    @Test
    @DisplayName("PASS - Verify addition (19)")
    void testAddition19() {
        int result = 25 + 44;
        assertEquals(69, result, "25 + 44 should equal 69");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (19)")
    void testSubtraction19() {
        int result = 140 - 33;
        assertEquals(107, result, "140 - 33 should equal 107");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (19)")
    void testMultiplication19() {
        int result = 24 * 25;
        assertEquals(600, result, "24 * 25 should equal 600");
    }

    @Test
    @DisplayName("PASS - Verify integer division (19)")
    void testDivision19() {
        int result = 1008 / 24;
        assertEquals(42, result, "1008 / 24 should equal 42");
    }

    @Test
    @DisplayName("PASS - Verify positive number (19)")
    void testPositiveNumber19() {
        int number = 268;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (19)")
    void testNegativeNumber19() {
        int number = -60;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (19)")
    void testStringNotEmpty19() {
        String text = "QualityCheck19";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (19)")
    void testStringEqualitySuccess19() {
        String actual = "QualityCheck19";
        assertEquals("QualityCheck19", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (19)")
    void testStringContains19() {
        String text = "QualityCheck19 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (19)")
    void testStringStartsWith19() {
        String text = "QualityCheck19";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (19)")
    void testListSizeSuccess19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (19)")
    void testListContainsSuccess19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertTrue(items.contains("TestNG19"),
                "The list should contain TestNG19");
    }

    @Test
    @DisplayName("PASS - Verify first list element (19)")
    void testFirstListElement19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertEquals("Python19", items.get(0),
                "The first element should be Python19");
    }

    @Test
    @DisplayName("PASS - Verify last list element (19)")
    void testLastListElement19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertEquals("Cypress19", items.get(2),
                "The last element should be Cypress19");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (19)")
    void testBooleanTrue19() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (19)")
    void testBooleanFalse19() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (19)")
    void testNotNull19() {
        String value = "QualityCheck19";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (19)")
    void testIsNull19() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (19)")
    void testArrayLength19() {
        int[] numbers = {23, 33, 43, 53, 63};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (19)")
    void testArrayElement19() {
        int[] numbers = {23, 33, 43};

        assertEquals(33, numbers[1],
                "The second element should be 33");
    }

    @Test
    @DisplayName("PASS - Verify addition (20)")
    void testAddition20() {
        int result = 26 + 46;
        assertEquals(72, result, "26 + 46 should equal 72");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (20)")
    void testSubtraction20() {
        int result = 145 - 34;
        assertEquals(111, result, "145 - 34 should equal 111");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (20)")
    void testMultiplication20() {
        int result = 25 * 26;
        assertEquals(650, result, "25 * 26 should equal 650");
    }

    @Test
    @DisplayName("PASS - Verify integer division (20)")
    void testDivision20() {
        int result = 1100 / 25;
        assertEquals(44, result, "1100 / 25 should equal 44");
    }

    @Test
    @DisplayName("PASS - Verify positive number (20)")
    void testPositiveNumber20() {
        int number = 269;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (20)")
    void testNegativeNumber20() {
        int number = -61;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (20)")
    void testStringNotEmpty20() {
        String text = "QualityCheck20";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (20)")
    void testStringEqualitySuccess20() {
        String actual = "QualityCheck20";
        assertEquals("QualityCheck20", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (20)")
    void testStringContains20() {
        String text = "QualityCheck20 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (20)")
    void testStringStartsWith20() {
        String text = "QualityCheck20";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (20)")
    void testListSizeSuccess20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (20)")
    void testListContainsSuccess20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertTrue(items.contains("TestNG20"),
                "The list should contain TestNG20");
    }

    @Test
    @DisplayName("PASS - Verify first list element (20)")
    void testFirstListElement20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertEquals("Python20", items.get(0),
                "The first element should be Python20");
    }

    @Test
    @DisplayName("PASS - Verify last list element (20)")
    void testLastListElement20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertEquals("Cypress20", items.get(2),
                "The last element should be Cypress20");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (20)")
    void testBooleanTrue20() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (20)")
    void testBooleanFalse20() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (20)")
    void testNotNull20() {
        String value = "QualityCheck20";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (20)")
    void testIsNull20() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (20)")
    void testArrayLength20() {
        int[] numbers = {24, 34, 44, 54, 64};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (20)")
    void testArrayElement20() {
        int[] numbers = {24, 34, 44};

        assertEquals(34, numbers[1],
                "The second element should be 34");
    }


    // =========================================================
    // ======================= FAILED =========================
    // ======================= 100 CASES =======================
    // =========================================================

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (16)")
    void testAdditionWrongExpected16() {
        int result = 22 + 38;

        assertEquals(65, result,
                "22 + 38 should equal 65");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (16)")
    void testSubtractionWrongExpected16() {
        int result = 125 - 30;

        assertEquals(125, result,
                "125 - 30 should equal 125");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (16)")
    void testMultiplicationWrongExpected16() {
        int result = 21 * 22;

        assertEquals(470, result,
                "21 * 22 should equal 470");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (16)")
    void testDivisionWrongExpected16() {
        int result = 756 / 21;

        assertEquals(40, result,
                "756 / 21 should equal 40");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (16)")
    void testPositiveNumberFailed16() {
        int number = -23;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (16)")
    void testNegativeNumberFailed16() {
        int number = 45;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (16)")
    void testStringEqualityFailed16() {
        String actual = "QualityCheck16";

        assertEquals("World16",
                actual,
                "The string should be World16");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (16)")
    void testStringContainsFailed16() {
        String text = "QualityCheck16";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (16)")
    void testStringStartsWithFailed16() {
        String text = "QualityCheck16";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (16)")
    void testStringEndsWithFailed16() {
        String text = "QualityCheck16";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (16)")
    void testListSizeFailed16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (16)")
    void testListContainsFailed16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (16)")
    void testFirstListElementFailed16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (16)")
    void testLastListElementFailed16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16",
                "Cypress16"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (16)")
    void testBooleanTrueFailed16() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (16)")
    void testBooleanFalseFailed16() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (16)")
    void testNotNullFailed16() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (16)")
    void testIsNullFailed16() {
        String value = "QualityCheck16";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (16)")
    void testArrayLengthFailed16() {
        int[] numbers = {20, 30, 40, 50, 60};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (16)")
    void testArrayElementFailed16() {
        int[] numbers = {20, 30, 40};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (17)")
    void testAdditionWrongExpected17() {
        int result = 23 + 40;

        assertEquals(68, result,
                "23 + 40 should equal 68");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (17)")
    void testSubtractionWrongExpected17() {
        int result = 130 - 31;

        assertEquals(130, result,
                "130 - 31 should equal 130");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (17)")
    void testMultiplicationWrongExpected17() {
        int result = 22 * 23;

        assertEquals(514, result,
                "22 * 23 should equal 514");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (17)")
    void testDivisionWrongExpected17() {
        int result = 836 / 22;

        assertEquals(42, result,
                "836 / 22 should equal 42");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (17)")
    void testPositiveNumberFailed17() {
        int number = -24;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (17)")
    void testNegativeNumberFailed17() {
        int number = 46;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (17)")
    void testStringEqualityFailed17() {
        String actual = "QualityCheck17";

        assertEquals("World17",
                actual,
                "The string should be World17");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (17)")
    void testStringContainsFailed17() {
        String text = "QualityCheck17";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (17)")
    void testStringStartsWithFailed17() {
        String text = "QualityCheck17";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (17)")
    void testStringEndsWithFailed17() {
        String text = "QualityCheck17";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (17)")
    void testListSizeFailed17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (17)")
    void testListContainsFailed17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (17)")
    void testFirstListElementFailed17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (17)")
    void testLastListElementFailed17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17",
                "Cypress17"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (17)")
    void testBooleanTrueFailed17() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (17)")
    void testBooleanFalseFailed17() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (17)")
    void testNotNullFailed17() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (17)")
    void testIsNullFailed17() {
        String value = "QualityCheck17";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (17)")
    void testArrayLengthFailed17() {
        int[] numbers = {21, 31, 41, 51, 61};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (17)")
    void testArrayElementFailed17() {
        int[] numbers = {21, 31, 41};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (18)")
    void testAdditionWrongExpected18() {
        int result = 24 + 42;

        assertEquals(71, result,
                "24 + 42 should equal 71");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (18)")
    void testSubtractionWrongExpected18() {
        int result = 135 - 32;

        assertEquals(135, result,
                "135 - 32 should equal 135");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (18)")
    void testMultiplicationWrongExpected18() {
        int result = 23 * 24;

        assertEquals(560, result,
                "23 * 24 should equal 560");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (18)")
    void testDivisionWrongExpected18() {
        int result = 920 / 23;

        assertEquals(44, result,
                "920 / 23 should equal 44");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (18)")
    void testPositiveNumberFailed18() {
        int number = -25;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (18)")
    void testNegativeNumberFailed18() {
        int number = 47;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (18)")
    void testStringEqualityFailed18() {
        String actual = "QualityCheck18";

        assertEquals("World18",
                actual,
                "The string should be World18");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (18)")
    void testStringContainsFailed18() {
        String text = "QualityCheck18";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (18)")
    void testStringStartsWithFailed18() {
        String text = "QualityCheck18";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (18)")
    void testStringEndsWithFailed18() {
        String text = "QualityCheck18";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (18)")
    void testListSizeFailed18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (18)")
    void testListContainsFailed18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (18)")
    void testFirstListElementFailed18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (18)")
    void testLastListElementFailed18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18",
                "Cypress18"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (18)")
    void testBooleanTrueFailed18() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (18)")
    void testBooleanFalseFailed18() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (18)")
    void testNotNullFailed18() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (18)")
    void testIsNullFailed18() {
        String value = "QualityCheck18";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (18)")
    void testArrayLengthFailed18() {
        int[] numbers = {22, 32, 42, 52, 62};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (18)")
    void testArrayElementFailed18() {
        int[] numbers = {22, 32, 42};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (19)")
    void testAdditionWrongExpected19() {
        int result = 25 + 44;

        assertEquals(74, result,
                "25 + 44 should equal 74");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (19)")
    void testSubtractionWrongExpected19() {
        int result = 140 - 33;

        assertEquals(140, result,
                "140 - 33 should equal 140");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (19)")
    void testMultiplicationWrongExpected19() {
        int result = 24 * 25;

        assertEquals(608, result,
                "24 * 25 should equal 608");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (19)")
    void testDivisionWrongExpected19() {
        int result = 1008 / 24;

        assertEquals(46, result,
                "1008 / 24 should equal 46");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (19)")
    void testPositiveNumberFailed19() {
        int number = -26;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (19)")
    void testNegativeNumberFailed19() {
        int number = 48;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (19)")
    void testStringEqualityFailed19() {
        String actual = "QualityCheck19";

        assertEquals("World19",
                actual,
                "The string should be World19");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (19)")
    void testStringContainsFailed19() {
        String text = "QualityCheck19";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (19)")
    void testStringStartsWithFailed19() {
        String text = "QualityCheck19";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (19)")
    void testStringEndsWithFailed19() {
        String text = "QualityCheck19";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (19)")
    void testListSizeFailed19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (19)")
    void testListContainsFailed19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (19)")
    void testFirstListElementFailed19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (19)")
    void testLastListElementFailed19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19",
                "Cypress19"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (19)")
    void testBooleanTrueFailed19() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (19)")
    void testBooleanFalseFailed19() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (19)")
    void testNotNullFailed19() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (19)")
    void testIsNullFailed19() {
        String value = "QualityCheck19";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (19)")
    void testArrayLengthFailed19() {
        int[] numbers = {23, 33, 43, 53, 63};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (19)")
    void testArrayElementFailed19() {
        int[] numbers = {23, 33, 43};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (20)")
    void testAdditionWrongExpected20() {
        int result = 26 + 46;

        assertEquals(77, result,
                "26 + 46 should equal 77");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (20)")
    void testSubtractionWrongExpected20() {
        int result = 145 - 34;

        assertEquals(145, result,
                "145 - 34 should equal 145");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (20)")
    void testMultiplicationWrongExpected20() {
        int result = 25 * 26;

        assertEquals(658, result,
                "25 * 26 should equal 658");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (20)")
    void testDivisionWrongExpected20() {
        int result = 1100 / 25;

        assertEquals(48, result,
                "1100 / 25 should equal 48");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (20)")
    void testPositiveNumberFailed20() {
        int number = -27;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (20)")
    void testNegativeNumberFailed20() {
        int number = 49;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (20)")
    void testStringEqualityFailed20() {
        String actual = "QualityCheck20";

        assertEquals("World20",
                actual,
                "The string should be World20");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (20)")
    void testStringContainsFailed20() {
        String text = "QualityCheck20";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (20)")
    void testStringStartsWithFailed20() {
        String text = "QualityCheck20";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (20)")
    void testStringEndsWithFailed20() {
        String text = "QualityCheck20";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (20)")
    void testListSizeFailed20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (20)")
    void testListContainsFailed20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (20)")
    void testFirstListElementFailed20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (20)")
    void testLastListElementFailed20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20",
                "Cypress20"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (20)")
    void testBooleanTrueFailed20() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (20)")
    void testBooleanFalseFailed20() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (20)")
    void testNotNullFailed20() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (20)")
    void testIsNullFailed20() {
        String value = "QualityCheck20";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (20)")
    void testArrayLengthFailed20() {
        int[] numbers = {24, 34, 44, 54, 64};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (20)")
    void testArrayElementFailed20() {
        int[] numbers = {24, 34, 44};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }


    // =========================================================
    // ======================== ERROR ==========================
    // ======================= 50 CASES ========================
    // =========================================================
    //
    // These tests throw runtime exceptions before reaching
    // the assertion.
    //
    // =========================================================

    @Test
    @DisplayName("ERROR - Division by zero (16)")
    void testDivisionByZero16() {
        int result = 40 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (16)")
    void testNullPointerAccess16() {
        String text = null;

        int length = text.length();

        assertEquals(25, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (16)")
    void testArrayOutOfBounds16() {
        int[] numbers = {5, 15, 25};

        int value = numbers[23];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (16)")
    void testInvalidNumberFormat16() {
        String value = "QualityCheck16";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (16)")
    void testListIndexOutOfBounds16() {
        List<String> items = Arrays.asList(
                "Python16",
                "TestNG16"
        );

        String item = items.get(24);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (16)")
    void testNegativeArraySize16() {
        int size = -27;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (16)")
    void testStringIndexOutOfBounds16() {
        String text = "TestNG16";

        char character = text.charAt(35);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (16)")
    void testRemoveFromEmptyList16() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (16)")
    void testInvalidArrayAccess16() {
        String[] tools = {
                "TestNG16",
                "Cypress16",
                "Postman16"
        };

        String tool = tools[30];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (16)")
    void testInvalidArithmeticOperation16() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (17)")
    void testDivisionByZero17() {
        int result = 41 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (17)")
    void testNullPointerAccess17() {
        String text = null;

        int length = text.length();

        assertEquals(26, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (17)")
    void testArrayOutOfBounds17() {
        int[] numbers = {5, 15, 25};

        int value = numbers[24];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (17)")
    void testInvalidNumberFormat17() {
        String value = "QualityCheck17";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (17)")
    void testListIndexOutOfBounds17() {
        List<String> items = Arrays.asList(
                "Python17",
                "TestNG17"
        );

        String item = items.get(25);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (17)")
    void testNegativeArraySize17() {
        int size = -28;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (17)")
    void testStringIndexOutOfBounds17() {
        String text = "TestNG17";

        char character = text.charAt(36);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (17)")
    void testRemoveFromEmptyList17() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (17)")
    void testInvalidArrayAccess17() {
        String[] tools = {
                "TestNG17",
                "Cypress17",
                "Postman17"
        };

        String tool = tools[31];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (17)")
    void testInvalidArithmeticOperation17() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (18)")
    void testDivisionByZero18() {
        int result = 42 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (18)")
    void testNullPointerAccess18() {
        String text = null;

        int length = text.length();

        assertEquals(27, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (18)")
    void testArrayOutOfBounds18() {
        int[] numbers = {5, 15, 25};

        int value = numbers[25];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (18)")
    void testInvalidNumberFormat18() {
        String value = "QualityCheck18";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (18)")
    void testListIndexOutOfBounds18() {
        List<String> items = Arrays.asList(
                "Python18",
                "TestNG18"
        );

        String item = items.get(26);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (18)")
    void testNegativeArraySize18() {
        int size = -29;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (18)")
    void testStringIndexOutOfBounds18() {
        String text = "TestNG18";

        char character = text.charAt(37);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (18)")
    void testRemoveFromEmptyList18() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (18)")
    void testInvalidArrayAccess18() {
        String[] tools = {
                "TestNG18",
                "Cypress18",
                "Postman18"
        };

        String tool = tools[32];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (18)")
    void testInvalidArithmeticOperation18() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (19)")
    void testDivisionByZero19() {
        int result = 43 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (19)")
    void testNullPointerAccess19() {
        String text = null;

        int length = text.length();

        assertEquals(28, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (19)")
    void testArrayOutOfBounds19() {
        int[] numbers = {5, 15, 25};

        int value = numbers[26];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (19)")
    void testInvalidNumberFormat19() {
        String value = "QualityCheck19";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (19)")
    void testListIndexOutOfBounds19() {
        List<String> items = Arrays.asList(
                "Python19",
                "TestNG19"
        );

        String item = items.get(27);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (19)")
    void testNegativeArraySize19() {
        int size = -30;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (19)")
    void testStringIndexOutOfBounds19() {
        String text = "TestNG19";

        char character = text.charAt(38);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (19)")
    void testRemoveFromEmptyList19() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (19)")
    void testInvalidArrayAccess19() {
        String[] tools = {
                "TestNG19",
                "Cypress19",
                "Postman19"
        };

        String tool = tools[33];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (19)")
    void testInvalidArithmeticOperation19() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (20)")
    void testDivisionByZero20() {
        int result = 44 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (20)")
    void testNullPointerAccess20() {
        String text = null;

        int length = text.length();

        assertEquals(29, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (20)")
    void testArrayOutOfBounds20() {
        int[] numbers = {5, 15, 25};

        int value = numbers[27];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (20)")
    void testInvalidNumberFormat20() {
        String value = "QualityCheck20";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (20)")
    void testListIndexOutOfBounds20() {
        List<String> items = Arrays.asList(
                "Python20",
                "TestNG20"
        );

        String item = items.get(28);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (20)")
    void testNegativeArraySize20() {
        int size = -31;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (20)")
    void testStringIndexOutOfBounds20() {
        String text = "TestNG20";

        char character = text.charAt(39);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (20)")
    void testRemoveFromEmptyList20() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (20)")
    void testInvalidArrayAccess20() {
        String[] tools = {
                "TestNG20",
                "Cypress20",
                "Postman20"
        };

        String tool = tools[34];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (20)")
    void testInvalidArithmeticOperation20() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }
}
