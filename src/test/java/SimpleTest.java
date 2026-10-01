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

    @Test
    @DisplayName("PASS - Verify addition (02)")
    void testAddition02() {
        int result = 8 + 10;
        assertEquals(18, result, "8 + 10 should equal 18");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (02)")
    void testSubtraction02() {
        int result = 55 - 16;
        assertEquals(39, result, "55 - 16 should equal 39");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (02)")
    void testMultiplication02() {
        int result = 7 * 8;
        assertEquals(56, result, "7 * 8 should equal 56");
    }

    @Test
    @DisplayName("PASS - Verify integer division (02)")
    void testDivision02() {
        int result = 56 / 7;
        assertEquals(8, result, "56 / 7 should equal 8");
    }

    @Test
    @DisplayName("PASS - Verify positive number (02)")
    void testPositiveNumber02() {
        int number = 251;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (02)")
    void testNegativeNumber02() {
        int number = -43;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (02)")
    void testStringNotEmpty02() {
        String text = "QualityCheck02";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (02)")
    void testStringEqualitySuccess02() {
        String actual = "QualityCheck02";
        assertEquals("QualityCheck02", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (02)")
    void testStringContains02() {
        String text = "QualityCheck02 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (02)")
    void testStringStartsWith02() {
        String text = "QualityCheck02";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (02)")
    void testListSizeSuccess02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (02)")
    void testListContainsSuccess02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertTrue(items.contains("TestNG02"),
                "The list should contain TestNG02");
    }

    @Test
    @DisplayName("PASS - Verify first list element (02)")
    void testFirstListElement02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertEquals("Python02", items.get(0),
                "The first element should be Python02");
    }

    @Test
    @DisplayName("PASS - Verify last list element (02)")
    void testLastListElement02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertEquals("Cypress02", items.get(2),
                "The last element should be Cypress02");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (02)")
    void testBooleanTrue02() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (02)")
    void testBooleanFalse02() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (02)")
    void testNotNull02() {
        String value = "QualityCheck02";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (02)")
    void testIsNull02() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (02)")
    void testArrayLength02() {
        int[] numbers = {6, 16, 26, 36, 46};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (02)")
    void testArrayElement02() {
        int[] numbers = {6, 16, 26};

        assertEquals(16, numbers[1],
                "The second element should be 16");
    }

    @Test
    @DisplayName("PASS - Verify addition (03)")
    void testAddition03() {
        int result = 9 + 12;
        assertEquals(21, result, "9 + 12 should equal 21");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (03)")
    void testSubtraction03() {
        int result = 60 - 17;
        assertEquals(43, result, "60 - 17 should equal 43");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (03)")
    void testMultiplication03() {
        int result = 8 * 9;
        assertEquals(72, result, "8 * 9 should equal 72");
    }

    @Test
    @DisplayName("PASS - Verify integer division (03)")
    void testDivision03() {
        int result = 80 / 8;
        assertEquals(10, result, "80 / 8 should equal 10");
    }

    @Test
    @DisplayName("PASS - Verify positive number (03)")
    void testPositiveNumber03() {
        int number = 252;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (03)")
    void testNegativeNumber03() {
        int number = -44;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (03)")
    void testStringNotEmpty03() {
        String text = "QualityCheck03";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (03)")
    void testStringEqualitySuccess03() {
        String actual = "QualityCheck03";
        assertEquals("QualityCheck03", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (03)")
    void testStringContains03() {
        String text = "QualityCheck03 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (03)")
    void testStringStartsWith03() {
        String text = "QualityCheck03";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (03)")
    void testListSizeSuccess03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (03)")
    void testListContainsSuccess03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertTrue(items.contains("TestNG03"),
                "The list should contain TestNG03");
    }

    @Test
    @DisplayName("PASS - Verify first list element (03)")
    void testFirstListElement03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertEquals("Python03", items.get(0),
                "The first element should be Python03");
    }

    @Test
    @DisplayName("PASS - Verify last list element (03)")
    void testLastListElement03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertEquals("Cypress03", items.get(2),
                "The last element should be Cypress03");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (03)")
    void testBooleanTrue03() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (03)")
    void testBooleanFalse03() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (03)")
    void testNotNull03() {
        String value = "QualityCheck03";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (03)")
    void testIsNull03() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (03)")
    void testArrayLength03() {
        int[] numbers = {7, 17, 27, 37, 47};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (03)")
    void testArrayElement03() {
        int[] numbers = {7, 17, 27};

        assertEquals(17, numbers[1],
                "The second element should be 17");
    }

    @Test
    @DisplayName("PASS - Verify addition (04)")
    void testAddition04() {
        int result = 10 + 14;
        assertEquals(24, result, "10 + 14 should equal 24");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (04)")
    void testSubtraction04() {
        int result = 65 - 18;
        assertEquals(47, result, "65 - 18 should equal 47");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (04)")
    void testMultiplication04() {
        int result = 9 * 10;
        assertEquals(90, result, "9 * 10 should equal 90");
    }

    @Test
    @DisplayName("PASS - Verify integer division (04)")
    void testDivision04() {
        int result = 108 / 9;
        assertEquals(12, result, "108 / 9 should equal 12");
    }

    @Test
    @DisplayName("PASS - Verify positive number (04)")
    void testPositiveNumber04() {
        int number = 253;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (04)")
    void testNegativeNumber04() {
        int number = -45;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (04)")
    void testStringNotEmpty04() {
        String text = "QualityCheck04";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (04)")
    void testStringEqualitySuccess04() {
        String actual = "QualityCheck04";
        assertEquals("QualityCheck04", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (04)")
    void testStringContains04() {
        String text = "QualityCheck04 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (04)")
    void testStringStartsWith04() {
        String text = "QualityCheck04";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (04)")
    void testListSizeSuccess04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (04)")
    void testListContainsSuccess04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertTrue(items.contains("TestNG04"),
                "The list should contain TestNG04");
    }

    @Test
    @DisplayName("PASS - Verify first list element (04)")
    void testFirstListElement04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertEquals("Python04", items.get(0),
                "The first element should be Python04");
    }

    @Test
    @DisplayName("PASS - Verify last list element (04)")
    void testLastListElement04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertEquals("Cypress04", items.get(2),
                "The last element should be Cypress04");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (04)")
    void testBooleanTrue04() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (04)")
    void testBooleanFalse04() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (04)")
    void testNotNull04() {
        String value = "QualityCheck04";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (04)")
    void testIsNull04() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (04)")
    void testArrayLength04() {
        int[] numbers = {8, 18, 28, 38, 48};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (04)")
    void testArrayElement04() {
        int[] numbers = {8, 18, 28};

        assertEquals(18, numbers[1],
                "The second element should be 18");
    }

    @Test
    @DisplayName("PASS - Verify addition (05)")
    void testAddition05() {
        int result = 11 + 16;
        assertEquals(27, result, "11 + 16 should equal 27");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (05)")
    void testSubtraction05() {
        int result = 70 - 19;
        assertEquals(51, result, "70 - 19 should equal 51");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (05)")
    void testMultiplication05() {
        int result = 10 * 11;
        assertEquals(110, result, "10 * 11 should equal 110");
    }

    @Test
    @DisplayName("PASS - Verify integer division (05)")
    void testDivision05() {
        int result = 140 / 10;
        assertEquals(14, result, "140 / 10 should equal 14");
    }

    @Test
    @DisplayName("PASS - Verify positive number (05)")
    void testPositiveNumber05() {
        int number = 254;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (05)")
    void testNegativeNumber05() {
        int number = -46;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (05)")
    void testStringNotEmpty05() {
        String text = "QualityCheck05";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (05)")
    void testStringEqualitySuccess05() {
        String actual = "QualityCheck05";
        assertEquals("QualityCheck05", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (05)")
    void testStringContains05() {
        String text = "QualityCheck05 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (05)")
    void testStringStartsWith05() {
        String text = "QualityCheck05";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (05)")
    void testListSizeSuccess05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (05)")
    void testListContainsSuccess05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertTrue(items.contains("TestNG05"),
                "The list should contain TestNG05");
    }

    @Test
    @DisplayName("PASS - Verify first list element (05)")
    void testFirstListElement05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertEquals("Python05", items.get(0),
                "The first element should be Python05");
    }

    @Test
    @DisplayName("PASS - Verify last list element (05)")
    void testLastListElement05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertEquals("Cypress05", items.get(2),
                "The last element should be Cypress05");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (05)")
    void testBooleanTrue05() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (05)")
    void testBooleanFalse05() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (05)")
    void testNotNull05() {
        String value = "QualityCheck05";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (05)")
    void testIsNull05() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (05)")
    void testArrayLength05() {
        int[] numbers = {9, 19, 29, 39, 49};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (05)")
    void testArrayElement05() {
        int[] numbers = {9, 19, 29};

        assertEquals(19, numbers[1],
                "The second element should be 19");
    }


    // =========================================================
    // ======================= FAILED =========================
    // ======================= 100 CASES =======================
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

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (02)")
    void testAdditionWrongExpected02() {
        int result = 8 + 10;

        assertEquals(23, result,
                "8 + 10 should equal 23");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (02)")
    void testSubtractionWrongExpected02() {
        int result = 55 - 16;

        assertEquals(55, result,
                "55 - 16 should equal 55");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (02)")
    void testMultiplicationWrongExpected02() {
        int result = 7 * 8;

        assertEquals(64, result,
                "7 * 8 should equal 64");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (02)")
    void testDivisionWrongExpected02() {
        int result = 56 / 7;

        assertEquals(12, result,
                "56 / 7 should equal 12");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (02)")
    void testPositiveNumberFailed02() {
        int number = -9;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (02)")
    void testNegativeNumberFailed02() {
        int number = 31;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (02)")
    void testStringEqualityFailed02() {
        String actual = "QualityCheck02";

        assertEquals("World02",
                actual,
                "The string should be World02");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (02)")
    void testStringContainsFailed02() {
        String text = "QualityCheck02";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (02)")
    void testStringStartsWithFailed02() {
        String text = "QualityCheck02";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (02)")
    void testStringEndsWithFailed02() {
        String text = "QualityCheck02";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (02)")
    void testListSizeFailed02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (02)")
    void testListContainsFailed02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (02)")
    void testFirstListElementFailed02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (02)")
    void testLastListElementFailed02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02",
                "Cypress02"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (02)")
    void testBooleanTrueFailed02() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (02)")
    void testBooleanFalseFailed02() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (02)")
    void testNotNullFailed02() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (02)")
    void testIsNullFailed02() {
        String value = "QualityCheck02";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (02)")
    void testArrayLengthFailed02() {
        int[] numbers = {6, 16, 26, 36, 46};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (02)")
    void testArrayElementFailed02() {
        int[] numbers = {6, 16, 26};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (03)")
    void testAdditionWrongExpected03() {
        int result = 9 + 12;

        assertEquals(26, result,
                "9 + 12 should equal 26");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (03)")
    void testSubtractionWrongExpected03() {
        int result = 60 - 17;

        assertEquals(60, result,
                "60 - 17 should equal 60");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (03)")
    void testMultiplicationWrongExpected03() {
        int result = 8 * 9;

        assertEquals(80, result,
                "8 * 9 should equal 80");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (03)")
    void testDivisionWrongExpected03() {
        int result = 80 / 8;

        assertEquals(14, result,
                "80 / 8 should equal 14");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (03)")
    void testPositiveNumberFailed03() {
        int number = -10;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (03)")
    void testNegativeNumberFailed03() {
        int number = 32;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (03)")
    void testStringEqualityFailed03() {
        String actual = "QualityCheck03";

        assertEquals("World03",
                actual,
                "The string should be World03");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (03)")
    void testStringContainsFailed03() {
        String text = "QualityCheck03";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (03)")
    void testStringStartsWithFailed03() {
        String text = "QualityCheck03";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (03)")
    void testStringEndsWithFailed03() {
        String text = "QualityCheck03";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (03)")
    void testListSizeFailed03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (03)")
    void testListContainsFailed03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (03)")
    void testFirstListElementFailed03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (03)")
    void testLastListElementFailed03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03",
                "Cypress03"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (03)")
    void testBooleanTrueFailed03() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (03)")
    void testBooleanFalseFailed03() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (03)")
    void testNotNullFailed03() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (03)")
    void testIsNullFailed03() {
        String value = "QualityCheck03";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (03)")
    void testArrayLengthFailed03() {
        int[] numbers = {7, 17, 27, 37, 47};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (03)")
    void testArrayElementFailed03() {
        int[] numbers = {7, 17, 27};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (04)")
    void testAdditionWrongExpected04() {
        int result = 10 + 14;

        assertEquals(29, result,
                "10 + 14 should equal 29");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (04)")
    void testSubtractionWrongExpected04() {
        int result = 65 - 18;

        assertEquals(65, result,
                "65 - 18 should equal 65");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (04)")
    void testMultiplicationWrongExpected04() {
        int result = 9 * 10;

        assertEquals(98, result,
                "9 * 10 should equal 98");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (04)")
    void testDivisionWrongExpected04() {
        int result = 108 / 9;

        assertEquals(16, result,
                "108 / 9 should equal 16");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (04)")
    void testPositiveNumberFailed04() {
        int number = -11;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (04)")
    void testNegativeNumberFailed04() {
        int number = 33;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (04)")
    void testStringEqualityFailed04() {
        String actual = "QualityCheck04";

        assertEquals("World04",
                actual,
                "The string should be World04");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (04)")
    void testStringContainsFailed04() {
        String text = "QualityCheck04";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (04)")
    void testStringStartsWithFailed04() {
        String text = "QualityCheck04";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (04)")
    void testStringEndsWithFailed04() {
        String text = "QualityCheck04";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (04)")
    void testListSizeFailed04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (04)")
    void testListContainsFailed04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (04)")
    void testFirstListElementFailed04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (04)")
    void testLastListElementFailed04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04",
                "Cypress04"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (04)")
    void testBooleanTrueFailed04() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (04)")
    void testBooleanFalseFailed04() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (04)")
    void testNotNullFailed04() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (04)")
    void testIsNullFailed04() {
        String value = "QualityCheck04";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (04)")
    void testArrayLengthFailed04() {
        int[] numbers = {8, 18, 28, 38, 48};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (04)")
    void testArrayElementFailed04() {
        int[] numbers = {8, 18, 28};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (05)")
    void testAdditionWrongExpected05() {
        int result = 11 + 16;

        assertEquals(32, result,
                "11 + 16 should equal 32");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (05)")
    void testSubtractionWrongExpected05() {
        int result = 70 - 19;

        assertEquals(70, result,
                "70 - 19 should equal 70");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (05)")
    void testMultiplicationWrongExpected05() {
        int result = 10 * 11;

        assertEquals(118, result,
                "10 * 11 should equal 118");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (05)")
    void testDivisionWrongExpected05() {
        int result = 140 / 10;

        assertEquals(18, result,
                "140 / 10 should equal 18");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (05)")
    void testPositiveNumberFailed05() {
        int number = -12;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (05)")
    void testNegativeNumberFailed05() {
        int number = 34;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (05)")
    void testStringEqualityFailed05() {
        String actual = "QualityCheck05";

        assertEquals("World05",
                actual,
                "The string should be World05");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (05)")
    void testStringContainsFailed05() {
        String text = "QualityCheck05";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (05)")
    void testStringStartsWithFailed05() {
        String text = "QualityCheck05";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (05)")
    void testStringEndsWithFailed05() {
        String text = "QualityCheck05";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (05)")
    void testListSizeFailed05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (05)")
    void testListContainsFailed05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (05)")
    void testFirstListElementFailed05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (05)")
    void testLastListElementFailed05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05",
                "Cypress05"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (05)")
    void testBooleanTrueFailed05() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (05)")
    void testBooleanFalseFailed05() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (05)")
    void testNotNullFailed05() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (05)")
    void testIsNullFailed05() {
        String value = "QualityCheck05";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (05)")
    void testArrayLengthFailed05() {
        int[] numbers = {9, 19, 29, 39, 49};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (05)")
    void testArrayElementFailed05() {
        int[] numbers = {9, 19, 29};

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

    @Test
    @DisplayName("ERROR - Division by zero (02)")
    void testDivisionByZero02() {
        int result = 26 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (02)")
    void testNullPointerAccess02() {
        String text = null;

        int length = text.length();

        assertEquals(11, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (02)")
    void testArrayOutOfBounds02() {
        int[] numbers = {5, 15, 25};

        int value = numbers[9];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (02)")
    void testInvalidNumberFormat02() {
        String value = "QualityCheck02";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (02)")
    void testListIndexOutOfBounds02() {
        List<String> items = Arrays.asList(
                "Python02",
                "TestNG02"
        );

        String item = items.get(10);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (02)")
    void testNegativeArraySize02() {
        int size = -13;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (02)")
    void testStringIndexOutOfBounds02() {
        String text = "TestNG02";

        char character = text.charAt(21);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (02)")
    void testRemoveFromEmptyList02() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (02)")
    void testInvalidArrayAccess02() {
        String[] tools = {
                "TestNG02",
                "Cypress02",
                "Postman02"
        };

        String tool = tools[16];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (02)")
    void testInvalidArithmeticOperation02() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (03)")
    void testDivisionByZero03() {
        int result = 27 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (03)")
    void testNullPointerAccess03() {
        String text = null;

        int length = text.length();

        assertEquals(12, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (03)")
    void testArrayOutOfBounds03() {
        int[] numbers = {5, 15, 25};

        int value = numbers[10];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (03)")
    void testInvalidNumberFormat03() {
        String value = "QualityCheck03";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (03)")
    void testListIndexOutOfBounds03() {
        List<String> items = Arrays.asList(
                "Python03",
                "TestNG03"
        );

        String item = items.get(11);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (03)")
    void testNegativeArraySize03() {
        int size = -14;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (03)")
    void testStringIndexOutOfBounds03() {
        String text = "TestNG03";

        char character = text.charAt(22);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (03)")
    void testRemoveFromEmptyList03() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (03)")
    void testInvalidArrayAccess03() {
        String[] tools = {
                "TestNG03",
                "Cypress03",
                "Postman03"
        };

        String tool = tools[17];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (03)")
    void testInvalidArithmeticOperation03() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (04)")
    void testDivisionByZero04() {
        int result = 28 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (04)")
    void testNullPointerAccess04() {
        String text = null;

        int length = text.length();

        assertEquals(13, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (04)")
    void testArrayOutOfBounds04() {
        int[] numbers = {5, 15, 25};

        int value = numbers[11];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (04)")
    void testInvalidNumberFormat04() {
        String value = "QualityCheck04";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (04)")
    void testListIndexOutOfBounds04() {
        List<String> items = Arrays.asList(
                "Python04",
                "TestNG04"
        );

        String item = items.get(12);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (04)")
    void testNegativeArraySize04() {
        int size = -15;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (04)")
    void testStringIndexOutOfBounds04() {
        String text = "TestNG04";

        char character = text.charAt(23);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (04)")
    void testRemoveFromEmptyList04() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (04)")
    void testInvalidArrayAccess04() {
        String[] tools = {
                "TestNG04",
                "Cypress04",
                "Postman04"
        };

        String tool = tools[18];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (04)")
    void testInvalidArithmeticOperation04() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (05)")
    void testDivisionByZero05() {
        int result = 29 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (05)")
    void testNullPointerAccess05() {
        String text = null;

        int length = text.length();

        assertEquals(14, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (05)")
    void testArrayOutOfBounds05() {
        int[] numbers = {5, 15, 25};

        int value = numbers[12];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (05)")
    void testInvalidNumberFormat05() {
        String value = "QualityCheck05";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (05)")
    void testListIndexOutOfBounds05() {
        List<String> items = Arrays.asList(
                "Python05",
                "TestNG05"
        );

        String item = items.get(13);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (05)")
    void testNegativeArraySize05() {
        int size = -16;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (05)")
    void testStringIndexOutOfBounds05() {
        String text = "TestNG05";

        char character = text.charAt(24);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (05)")
    void testRemoveFromEmptyList05() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (05)")
    void testInvalidArrayAccess05() {
        String[] tools = {
                "TestNG05",
                "Cypress05",
                "Postman05"
        };

        String tool = tools[19];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (05)")
    void testInvalidArithmeticOperation05() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }
}
