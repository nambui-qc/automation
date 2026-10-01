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
    @DisplayName("PASS - Verify addition (06)")
    void testAddition06() {
        int result = 12 + 18;
        assertEquals(30, result, "12 + 18 should equal 30");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (06)")
    void testSubtraction06() {
        int result = 75 - 20;
        assertEquals(55, result, "75 - 20 should equal 55");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (06)")
    void testMultiplication06() {
        int result = 11 * 12;
        assertEquals(132, result, "11 * 12 should equal 132");
    }

    @Test
    @DisplayName("PASS - Verify integer division (06)")
    void testDivision06() {
        int result = 176 / 11;
        assertEquals(16, result, "176 / 11 should equal 16");
    }

    @Test
    @DisplayName("PASS - Verify positive number (06)")
    void testPositiveNumber06() {
        int number = 255;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (06)")
    void testNegativeNumber06() {
        int number = -47;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (06)")
    void testStringNotEmpty06() {
        String text = "QualityCheck06";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (06)")
    void testStringEqualitySuccess06() {
        String actual = "QualityCheck06";
        assertEquals("QualityCheck06", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (06)")
    void testStringContains06() {
        String text = "QualityCheck06 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (06)")
    void testStringStartsWith06() {
        String text = "QualityCheck06";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (06)")
    void testListSizeSuccess06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (06)")
    void testListContainsSuccess06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertTrue(items.contains("TestNG06"),
                "The list should contain TestNG06");
    }

    @Test
    @DisplayName("PASS - Verify first list element (06)")
    void testFirstListElement06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertEquals("Python06", items.get(0),
                "The first element should be Python06");
    }

    @Test
    @DisplayName("PASS - Verify last list element (06)")
    void testLastListElement06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertEquals("Cypress06", items.get(2),
                "The last element should be Cypress06");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (06)")
    void testBooleanTrue06() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (06)")
    void testBooleanFalse06() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (06)")
    void testNotNull06() {
        String value = "QualityCheck06";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (06)")
    void testIsNull06() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (06)")
    void testArrayLength06() {
        int[] numbers = {10, 20, 30, 40, 50};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (06)")
    void testArrayElement06() {
        int[] numbers = {10, 20, 30};

        assertEquals(20, numbers[1],
                "The second element should be 20");
    }

    @Test
    @DisplayName("PASS - Verify addition (07)")
    void testAddition07() {
        int result = 13 + 20;
        assertEquals(33, result, "13 + 20 should equal 33");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (07)")
    void testSubtraction07() {
        int result = 80 - 21;
        assertEquals(59, result, "80 - 21 should equal 59");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (07)")
    void testMultiplication07() {
        int result = 12 * 13;
        assertEquals(156, result, "12 * 13 should equal 156");
    }

    @Test
    @DisplayName("PASS - Verify integer division (07)")
    void testDivision07() {
        int result = 216 / 12;
        assertEquals(18, result, "216 / 12 should equal 18");
    }

    @Test
    @DisplayName("PASS - Verify positive number (07)")
    void testPositiveNumber07() {
        int number = 256;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (07)")
    void testNegativeNumber07() {
        int number = -48;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (07)")
    void testStringNotEmpty07() {
        String text = "QualityCheck07";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (07)")
    void testStringEqualitySuccess07() {
        String actual = "QualityCheck07";
        assertEquals("QualityCheck07", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (07)")
    void testStringContains07() {
        String text = "QualityCheck07 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (07)")
    void testStringStartsWith07() {
        String text = "QualityCheck07";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (07)")
    void testListSizeSuccess07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (07)")
    void testListContainsSuccess07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertTrue(items.contains("TestNG07"),
                "The list should contain TestNG07");
    }

    @Test
    @DisplayName("PASS - Verify first list element (07)")
    void testFirstListElement07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertEquals("Python07", items.get(0),
                "The first element should be Python07");
    }

    @Test
    @DisplayName("PASS - Verify last list element (07)")
    void testLastListElement07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertEquals("Cypress07", items.get(2),
                "The last element should be Cypress07");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (07)")
    void testBooleanTrue07() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (07)")
    void testBooleanFalse07() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (07)")
    void testNotNull07() {
        String value = "QualityCheck07";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (07)")
    void testIsNull07() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (07)")
    void testArrayLength07() {
        int[] numbers = {11, 21, 31, 41, 51};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (07)")
    void testArrayElement07() {
        int[] numbers = {11, 21, 31};

        assertEquals(21, numbers[1],
                "The second element should be 21");
    }

    @Test
    @DisplayName("PASS - Verify addition (08)")
    void testAddition08() {
        int result = 14 + 22;
        assertEquals(36, result, "14 + 22 should equal 36");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (08)")
    void testSubtraction08() {
        int result = 85 - 22;
        assertEquals(63, result, "85 - 22 should equal 63");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (08)")
    void testMultiplication08() {
        int result = 13 * 14;
        assertEquals(182, result, "13 * 14 should equal 182");
    }

    @Test
    @DisplayName("PASS - Verify integer division (08)")
    void testDivision08() {
        int result = 260 / 13;
        assertEquals(20, result, "260 / 13 should equal 20");
    }

    @Test
    @DisplayName("PASS - Verify positive number (08)")
    void testPositiveNumber08() {
        int number = 257;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (08)")
    void testNegativeNumber08() {
        int number = -49;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (08)")
    void testStringNotEmpty08() {
        String text = "QualityCheck08";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (08)")
    void testStringEqualitySuccess08() {
        String actual = "QualityCheck08";
        assertEquals("QualityCheck08", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (08)")
    void testStringContains08() {
        String text = "QualityCheck08 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (08)")
    void testStringStartsWith08() {
        String text = "QualityCheck08";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (08)")
    void testListSizeSuccess08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (08)")
    void testListContainsSuccess08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertTrue(items.contains("TestNG08"),
                "The list should contain TestNG08");
    }

    @Test
    @DisplayName("PASS - Verify first list element (08)")
    void testFirstListElement08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertEquals("Python08", items.get(0),
                "The first element should be Python08");
    }

    @Test
    @DisplayName("PASS - Verify last list element (08)")
    void testLastListElement08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertEquals("Cypress08", items.get(2),
                "The last element should be Cypress08");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (08)")
    void testBooleanTrue08() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (08)")
    void testBooleanFalse08() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (08)")
    void testNotNull08() {
        String value = "QualityCheck08";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (08)")
    void testIsNull08() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (08)")
    void testArrayLength08() {
        int[] numbers = {12, 22, 32, 42, 52};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (08)")
    void testArrayElement08() {
        int[] numbers = {12, 22, 32};

        assertEquals(22, numbers[1],
                "The second element should be 22");
    }

    @Test
    @DisplayName("PASS - Verify addition (09)")
    void testAddition09() {
        int result = 15 + 24;
        assertEquals(39, result, "15 + 24 should equal 39");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (09)")
    void testSubtraction09() {
        int result = 90 - 23;
        assertEquals(67, result, "90 - 23 should equal 67");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (09)")
    void testMultiplication09() {
        int result = 14 * 15;
        assertEquals(210, result, "14 * 15 should equal 210");
    }

    @Test
    @DisplayName("PASS - Verify integer division (09)")
    void testDivision09() {
        int result = 308 / 14;
        assertEquals(22, result, "308 / 14 should equal 22");
    }

    @Test
    @DisplayName("PASS - Verify positive number (09)")
    void testPositiveNumber09() {
        int number = 258;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (09)")
    void testNegativeNumber09() {
        int number = -50;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (09)")
    void testStringNotEmpty09() {
        String text = "QualityCheck09";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (09)")
    void testStringEqualitySuccess09() {
        String actual = "QualityCheck09";
        assertEquals("QualityCheck09", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (09)")
    void testStringContains09() {
        String text = "QualityCheck09 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (09)")
    void testStringStartsWith09() {
        String text = "QualityCheck09";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (09)")
    void testListSizeSuccess09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (09)")
    void testListContainsSuccess09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertTrue(items.contains("TestNG09"),
                "The list should contain TestNG09");
    }

    @Test
    @DisplayName("PASS - Verify first list element (09)")
    void testFirstListElement09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertEquals("Python09", items.get(0),
                "The first element should be Python09");
    }

    @Test
    @DisplayName("PASS - Verify last list element (09)")
    void testLastListElement09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertEquals("Cypress09", items.get(2),
                "The last element should be Cypress09");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (09)")
    void testBooleanTrue09() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (09)")
    void testBooleanFalse09() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (09)")
    void testNotNull09() {
        String value = "QualityCheck09";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (09)")
    void testIsNull09() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (09)")
    void testArrayLength09() {
        int[] numbers = {13, 23, 33, 43, 53};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (09)")
    void testArrayElement09() {
        int[] numbers = {13, 23, 33};

        assertEquals(23, numbers[1],
                "The second element should be 23");
    }

    @Test
    @DisplayName("PASS - Verify addition (10)")
    void testAddition10() {
        int result = 16 + 26;
        assertEquals(42, result, "16 + 26 should equal 42");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (10)")
    void testSubtraction10() {
        int result = 95 - 24;
        assertEquals(71, result, "95 - 24 should equal 71");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (10)")
    void testMultiplication10() {
        int result = 15 * 16;
        assertEquals(240, result, "15 * 16 should equal 240");
    }

    @Test
    @DisplayName("PASS - Verify integer division (10)")
    void testDivision10() {
        int result = 360 / 15;
        assertEquals(24, result, "360 / 15 should equal 24");
    }

    @Test
    @DisplayName("PASS - Verify positive number (10)")
    void testPositiveNumber10() {
        int number = 259;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (10)")
    void testNegativeNumber10() {
        int number = -51;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (10)")
    void testStringNotEmpty10() {
        String text = "QualityCheck10";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (10)")
    void testStringEqualitySuccess10() {
        String actual = "QualityCheck10";
        assertEquals("QualityCheck10", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (10)")
    void testStringContains10() {
        String text = "QualityCheck10 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (10)")
    void testStringStartsWith10() {
        String text = "QualityCheck10";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (10)")
    void testListSizeSuccess10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (10)")
    void testListContainsSuccess10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertTrue(items.contains("TestNG10"),
                "The list should contain TestNG10");
    }

    @Test
    @DisplayName("PASS - Verify first list element (10)")
    void testFirstListElement10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertEquals("Python10", items.get(0),
                "The first element should be Python10");
    }

    @Test
    @DisplayName("PASS - Verify last list element (10)")
    void testLastListElement10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertEquals("Cypress10", items.get(2),
                "The last element should be Cypress10");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (10)")
    void testBooleanTrue10() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (10)")
    void testBooleanFalse10() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (10)")
    void testNotNull10() {
        String value = "QualityCheck10";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (10)")
    void testIsNull10() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (10)")
    void testArrayLength10() {
        int[] numbers = {14, 24, 34, 44, 54};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (10)")
    void testArrayElement10() {
        int[] numbers = {14, 24, 34};

        assertEquals(24, numbers[1],
                "The second element should be 24");
    }


    // =========================================================
    // ======================= FAILED =========================
    // ======================= 100 CASES =======================
    // =========================================================

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (06)")
    void testAdditionWrongExpected06() {
        int result = 12 + 18;

        assertEquals(35, result,
                "12 + 18 should equal 35");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (06)")
    void testSubtractionWrongExpected06() {
        int result = 75 - 20;

        assertEquals(75, result,
                "75 - 20 should equal 75");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (06)")
    void testMultiplicationWrongExpected06() {
        int result = 11 * 12;

        assertEquals(140, result,
                "11 * 12 should equal 140");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (06)")
    void testDivisionWrongExpected06() {
        int result = 176 / 11;

        assertEquals(20, result,
                "176 / 11 should equal 20");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (06)")
    void testPositiveNumberFailed06() {
        int number = -13;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (06)")
    void testNegativeNumberFailed06() {
        int number = 35;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (06)")
    void testStringEqualityFailed06() {
        String actual = "QualityCheck06";

        assertEquals("World06",
                actual,
                "The string should be World06");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (06)")
    void testStringContainsFailed06() {
        String text = "QualityCheck06";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (06)")
    void testStringStartsWithFailed06() {
        String text = "QualityCheck06";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (06)")
    void testStringEndsWithFailed06() {
        String text = "QualityCheck06";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (06)")
    void testListSizeFailed06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (06)")
    void testListContainsFailed06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (06)")
    void testFirstListElementFailed06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (06)")
    void testLastListElementFailed06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06",
                "Cypress06"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (06)")
    void testBooleanTrueFailed06() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (06)")
    void testBooleanFalseFailed06() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (06)")
    void testNotNullFailed06() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (06)")
    void testIsNullFailed06() {
        String value = "QualityCheck06";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (06)")
    void testArrayLengthFailed06() {
        int[] numbers = {10, 20, 30, 40, 50};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (06)")
    void testArrayElementFailed06() {
        int[] numbers = {10, 20, 30};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (07)")
    void testAdditionWrongExpected07() {
        int result = 13 + 20;

        assertEquals(38, result,
                "13 + 20 should equal 38");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (07)")
    void testSubtractionWrongExpected07() {
        int result = 80 - 21;

        assertEquals(80, result,
                "80 - 21 should equal 80");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (07)")
    void testMultiplicationWrongExpected07() {
        int result = 12 * 13;

        assertEquals(164, result,
                "12 * 13 should equal 164");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (07)")
    void testDivisionWrongExpected07() {
        int result = 216 / 12;

        assertEquals(22, result,
                "216 / 12 should equal 22");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (07)")
    void testPositiveNumberFailed07() {
        int number = -14;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (07)")
    void testNegativeNumberFailed07() {
        int number = 36;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (07)")
    void testStringEqualityFailed07() {
        String actual = "QualityCheck07";

        assertEquals("World07",
                actual,
                "The string should be World07");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (07)")
    void testStringContainsFailed07() {
        String text = "QualityCheck07";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (07)")
    void testStringStartsWithFailed07() {
        String text = "QualityCheck07";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (07)")
    void testStringEndsWithFailed07() {
        String text = "QualityCheck07";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (07)")
    void testListSizeFailed07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (07)")
    void testListContainsFailed07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (07)")
    void testFirstListElementFailed07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (07)")
    void testLastListElementFailed07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07",
                "Cypress07"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (07)")
    void testBooleanTrueFailed07() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (07)")
    void testBooleanFalseFailed07() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (07)")
    void testNotNullFailed07() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (07)")
    void testIsNullFailed07() {
        String value = "QualityCheck07";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (07)")
    void testArrayLengthFailed07() {
        int[] numbers = {11, 21, 31, 41, 51};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (07)")
    void testArrayElementFailed07() {
        int[] numbers = {11, 21, 31};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (08)")
    void testAdditionWrongExpected08() {
        int result = 14 + 22;

        assertEquals(41, result,
                "14 + 22 should equal 41");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (08)")
    void testSubtractionWrongExpected08() {
        int result = 85 - 22;

        assertEquals(85, result,
                "85 - 22 should equal 85");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (08)")
    void testMultiplicationWrongExpected08() {
        int result = 13 * 14;

        assertEquals(190, result,
                "13 * 14 should equal 190");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (08)")
    void testDivisionWrongExpected08() {
        int result = 260 / 13;

        assertEquals(24, result,
                "260 / 13 should equal 24");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (08)")
    void testPositiveNumberFailed08() {
        int number = -15;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (08)")
    void testNegativeNumberFailed08() {
        int number = 37;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (08)")
    void testStringEqualityFailed08() {
        String actual = "QualityCheck08";

        assertEquals("World08",
                actual,
                "The string should be World08");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (08)")
    void testStringContainsFailed08() {
        String text = "QualityCheck08";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (08)")
    void testStringStartsWithFailed08() {
        String text = "QualityCheck08";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (08)")
    void testStringEndsWithFailed08() {
        String text = "QualityCheck08";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (08)")
    void testListSizeFailed08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (08)")
    void testListContainsFailed08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (08)")
    void testFirstListElementFailed08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (08)")
    void testLastListElementFailed08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08",
                "Cypress08"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (08)")
    void testBooleanTrueFailed08() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (08)")
    void testBooleanFalseFailed08() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (08)")
    void testNotNullFailed08() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (08)")
    void testIsNullFailed08() {
        String value = "QualityCheck08";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (08)")
    void testArrayLengthFailed08() {
        int[] numbers = {12, 22, 32, 42, 52};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (08)")
    void testArrayElementFailed08() {
        int[] numbers = {12, 22, 32};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (09)")
    void testAdditionWrongExpected09() {
        int result = 15 + 24;

        assertEquals(44, result,
                "15 + 24 should equal 44");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (09)")
    void testSubtractionWrongExpected09() {
        int result = 90 - 23;

        assertEquals(90, result,
                "90 - 23 should equal 90");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (09)")
    void testMultiplicationWrongExpected09() {
        int result = 14 * 15;

        assertEquals(218, result,
                "14 * 15 should equal 218");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (09)")
    void testDivisionWrongExpected09() {
        int result = 308 / 14;

        assertEquals(26, result,
                "308 / 14 should equal 26");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (09)")
    void testPositiveNumberFailed09() {
        int number = -16;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (09)")
    void testNegativeNumberFailed09() {
        int number = 38;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (09)")
    void testStringEqualityFailed09() {
        String actual = "QualityCheck09";

        assertEquals("World09",
                actual,
                "The string should be World09");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (09)")
    void testStringContainsFailed09() {
        String text = "QualityCheck09";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (09)")
    void testStringStartsWithFailed09() {
        String text = "QualityCheck09";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (09)")
    void testStringEndsWithFailed09() {
        String text = "QualityCheck09";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (09)")
    void testListSizeFailed09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (09)")
    void testListContainsFailed09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (09)")
    void testFirstListElementFailed09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (09)")
    void testLastListElementFailed09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09",
                "Cypress09"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (09)")
    void testBooleanTrueFailed09() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (09)")
    void testBooleanFalseFailed09() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (09)")
    void testNotNullFailed09() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (09)")
    void testIsNullFailed09() {
        String value = "QualityCheck09";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (09)")
    void testArrayLengthFailed09() {
        int[] numbers = {13, 23, 33, 43, 53};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (09)")
    void testArrayElementFailed09() {
        int[] numbers = {13, 23, 33};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (10)")
    void testAdditionWrongExpected10() {
        int result = 16 + 26;

        assertEquals(47, result,
                "16 + 26 should equal 47");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (10)")
    void testSubtractionWrongExpected10() {
        int result = 95 - 24;

        assertEquals(95, result,
                "95 - 24 should equal 95");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (10)")
    void testMultiplicationWrongExpected10() {
        int result = 15 * 16;

        assertEquals(248, result,
                "15 * 16 should equal 248");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (10)")
    void testDivisionWrongExpected10() {
        int result = 360 / 15;

        assertEquals(28, result,
                "360 / 15 should equal 28");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (10)")
    void testPositiveNumberFailed10() {
        int number = -17;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (10)")
    void testNegativeNumberFailed10() {
        int number = 39;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (10)")
    void testStringEqualityFailed10() {
        String actual = "QualityCheck10";

        assertEquals("World10",
                actual,
                "The string should be World10");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (10)")
    void testStringContainsFailed10() {
        String text = "QualityCheck10";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (10)")
    void testStringStartsWithFailed10() {
        String text = "QualityCheck10";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (10)")
    void testStringEndsWithFailed10() {
        String text = "QualityCheck10";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (10)")
    void testListSizeFailed10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (10)")
    void testListContainsFailed10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (10)")
    void testFirstListElementFailed10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (10)")
    void testLastListElementFailed10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10",
                "Cypress10"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (10)")
    void testBooleanTrueFailed10() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (10)")
    void testBooleanFalseFailed10() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (10)")
    void testNotNullFailed10() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (10)")
    void testIsNullFailed10() {
        String value = "QualityCheck10";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (10)")
    void testArrayLengthFailed10() {
        int[] numbers = {14, 24, 34, 44, 54};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (10)")
    void testArrayElementFailed10() {
        int[] numbers = {14, 24, 34};

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
    @DisplayName("ERROR - Division by zero (06)")
    void testDivisionByZero06() {
        int result = 30 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (06)")
    void testNullPointerAccess06() {
        String text = null;

        int length = text.length();

        assertEquals(15, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (06)")
    void testArrayOutOfBounds06() {
        int[] numbers = {5, 15, 25};

        int value = numbers[13];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (06)")
    void testInvalidNumberFormat06() {
        String value = "QualityCheck06";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (06)")
    void testListIndexOutOfBounds06() {
        List<String> items = Arrays.asList(
                "Python06",
                "TestNG06"
        );

        String item = items.get(14);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (06)")
    void testNegativeArraySize06() {
        int size = -17;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (06)")
    void testStringIndexOutOfBounds06() {
        String text = "TestNG06";

        char character = text.charAt(25);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (06)")
    void testRemoveFromEmptyList06() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (06)")
    void testInvalidArrayAccess06() {
        String[] tools = {
                "TestNG06",
                "Cypress06",
                "Postman06"
        };

        String tool = tools[20];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (06)")
    void testInvalidArithmeticOperation06() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (07)")
    void testDivisionByZero07() {
        int result = 31 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (07)")
    void testNullPointerAccess07() {
        String text = null;

        int length = text.length();

        assertEquals(16, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (07)")
    void testArrayOutOfBounds07() {
        int[] numbers = {5, 15, 25};

        int value = numbers[14];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (07)")
    void testInvalidNumberFormat07() {
        String value = "QualityCheck07";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (07)")
    void testListIndexOutOfBounds07() {
        List<String> items = Arrays.asList(
                "Python07",
                "TestNG07"
        );

        String item = items.get(15);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (07)")
    void testNegativeArraySize07() {
        int size = -18;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (07)")
    void testStringIndexOutOfBounds07() {
        String text = "TestNG07";

        char character = text.charAt(26);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (07)")
    void testRemoveFromEmptyList07() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (07)")
    void testInvalidArrayAccess07() {
        String[] tools = {
                "TestNG07",
                "Cypress07",
                "Postman07"
        };

        String tool = tools[21];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (07)")
    void testInvalidArithmeticOperation07() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (08)")
    void testDivisionByZero08() {
        int result = 32 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (08)")
    void testNullPointerAccess08() {
        String text = null;

        int length = text.length();

        assertEquals(17, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (08)")
    void testArrayOutOfBounds08() {
        int[] numbers = {5, 15, 25};

        int value = numbers[15];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (08)")
    void testInvalidNumberFormat08() {
        String value = "QualityCheck08";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (08)")
    void testListIndexOutOfBounds08() {
        List<String> items = Arrays.asList(
                "Python08",
                "TestNG08"
        );

        String item = items.get(16);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (08)")
    void testNegativeArraySize08() {
        int size = -19;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (08)")
    void testStringIndexOutOfBounds08() {
        String text = "TestNG08";

        char character = text.charAt(27);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (08)")
    void testRemoveFromEmptyList08() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (08)")
    void testInvalidArrayAccess08() {
        String[] tools = {
                "TestNG08",
                "Cypress08",
                "Postman08"
        };

        String tool = tools[22];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (08)")
    void testInvalidArithmeticOperation08() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (09)")
    void testDivisionByZero09() {
        int result = 33 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (09)")
    void testNullPointerAccess09() {
        String text = null;

        int length = text.length();

        assertEquals(18, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (09)")
    void testArrayOutOfBounds09() {
        int[] numbers = {5, 15, 25};

        int value = numbers[16];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (09)")
    void testInvalidNumberFormat09() {
        String value = "QualityCheck09";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (09)")
    void testListIndexOutOfBounds09() {
        List<String> items = Arrays.asList(
                "Python09",
                "TestNG09"
        );

        String item = items.get(17);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (09)")
    void testNegativeArraySize09() {
        int size = -20;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (09)")
    void testStringIndexOutOfBounds09() {
        String text = "TestNG09";

        char character = text.charAt(28);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (09)")
    void testRemoveFromEmptyList09() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (09)")
    void testInvalidArrayAccess09() {
        String[] tools = {
                "TestNG09",
                "Cypress09",
                "Postman09"
        };

        String tool = tools[23];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (09)")
    void testInvalidArithmeticOperation09() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (10)")
    void testDivisionByZero10() {
        int result = 34 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (10)")
    void testNullPointerAccess10() {
        String text = null;

        int length = text.length();

        assertEquals(19, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (10)")
    void testArrayOutOfBounds10() {
        int[] numbers = {5, 15, 25};

        int value = numbers[17];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (10)")
    void testInvalidNumberFormat10() {
        String value = "QualityCheck10";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (10)")
    void testListIndexOutOfBounds10() {
        List<String> items = Arrays.asList(
                "Python10",
                "TestNG10"
        );

        String item = items.get(18);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (10)")
    void testNegativeArraySize10() {
        int size = -21;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (10)")
    void testStringIndexOutOfBounds10() {
        String text = "TestNG10";

        char character = text.charAt(29);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (10)")
    void testRemoveFromEmptyList10() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (10)")
    void testInvalidArrayAccess10() {
        String[] tools = {
                "TestNG10",
                "Cypress10",
                "Postman10"
        };

        String tool = tools[24];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (10)")
    void testInvalidArithmeticOperation10() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }
}
