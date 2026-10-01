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
    @DisplayName("PASS - Verify addition (11)")
    void testAddition11() {
        int result = 17 + 28;
        assertEquals(45, result, "17 + 28 should equal 45");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (11)")
    void testSubtraction11() {
        int result = 100 - 25;
        assertEquals(75, result, "100 - 25 should equal 75");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (11)")
    void testMultiplication11() {
        int result = 16 * 17;
        assertEquals(272, result, "16 * 17 should equal 272");
    }

    @Test
    @DisplayName("PASS - Verify integer division (11)")
    void testDivision11() {
        int result = 416 / 16;
        assertEquals(26, result, "416 / 16 should equal 26");
    }

    @Test
    @DisplayName("PASS - Verify positive number (11)")
    void testPositiveNumber11() {
        int number = 260;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (11)")
    void testNegativeNumber11() {
        int number = -52;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (11)")
    void testStringNotEmpty11() {
        String text = "QualityCheck11";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (11)")
    void testStringEqualitySuccess11() {
        String actual = "QualityCheck11";
        assertEquals("QualityCheck11", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (11)")
    void testStringContains11() {
        String text = "QualityCheck11 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (11)")
    void testStringStartsWith11() {
        String text = "QualityCheck11";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (11)")
    void testListSizeSuccess11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (11)")
    void testListContainsSuccess11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertTrue(items.contains("TestNG11"),
                "The list should contain TestNG11");
    }

    @Test
    @DisplayName("PASS - Verify first list element (11)")
    void testFirstListElement11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertEquals("Python11", items.get(0),
                "The first element should be Python11");
    }

    @Test
    @DisplayName("PASS - Verify last list element (11)")
    void testLastListElement11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertEquals("Cypress11", items.get(2),
                "The last element should be Cypress11");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (11)")
    void testBooleanTrue11() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (11)")
    void testBooleanFalse11() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (11)")
    void testNotNull11() {
        String value = "QualityCheck11";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (11)")
    void testIsNull11() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (11)")
    void testArrayLength11() {
        int[] numbers = {15, 25, 35, 45, 55};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (11)")
    void testArrayElement11() {
        int[] numbers = {15, 25, 35};

        assertEquals(25, numbers[1],
                "The second element should be 25");
    }

    @Test
    @DisplayName("PASS - Verify addition (12)")
    void testAddition12() {
        int result = 18 + 30;
        assertEquals(48, result, "18 + 30 should equal 48");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (12)")
    void testSubtraction12() {
        int result = 105 - 26;
        assertEquals(79, result, "105 - 26 should equal 79");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (12)")
    void testMultiplication12() {
        int result = 17 * 18;
        assertEquals(306, result, "17 * 18 should equal 306");
    }

    @Test
    @DisplayName("PASS - Verify integer division (12)")
    void testDivision12() {
        int result = 476 / 17;
        assertEquals(28, result, "476 / 17 should equal 28");
    }

    @Test
    @DisplayName("PASS - Verify positive number (12)")
    void testPositiveNumber12() {
        int number = 261;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (12)")
    void testNegativeNumber12() {
        int number = -53;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (12)")
    void testStringNotEmpty12() {
        String text = "QualityCheck12";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (12)")
    void testStringEqualitySuccess12() {
        String actual = "QualityCheck12";
        assertEquals("QualityCheck12", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (12)")
    void testStringContains12() {
        String text = "QualityCheck12 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (12)")
    void testStringStartsWith12() {
        String text = "QualityCheck12";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (12)")
    void testListSizeSuccess12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (12)")
    void testListContainsSuccess12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertTrue(items.contains("TestNG12"),
                "The list should contain TestNG12");
    }

    @Test
    @DisplayName("PASS - Verify first list element (12)")
    void testFirstListElement12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertEquals("Python12", items.get(0),
                "The first element should be Python12");
    }

    @Test
    @DisplayName("PASS - Verify last list element (12)")
    void testLastListElement12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertEquals("Cypress12", items.get(2),
                "The last element should be Cypress12");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (12)")
    void testBooleanTrue12() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (12)")
    void testBooleanFalse12() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (12)")
    void testNotNull12() {
        String value = "QualityCheck12";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (12)")
    void testIsNull12() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (12)")
    void testArrayLength12() {
        int[] numbers = {16, 26, 36, 46, 56};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (12)")
    void testArrayElement12() {
        int[] numbers = {16, 26, 36};

        assertEquals(26, numbers[1],
                "The second element should be 26");
    }

    @Test
    @DisplayName("PASS - Verify addition (13)")
    void testAddition13() {
        int result = 19 + 32;
        assertEquals(51, result, "19 + 32 should equal 51");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (13)")
    void testSubtraction13() {
        int result = 110 - 27;
        assertEquals(83, result, "110 - 27 should equal 83");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (13)")
    void testMultiplication13() {
        int result = 18 * 19;
        assertEquals(342, result, "18 * 19 should equal 342");
    }

    @Test
    @DisplayName("PASS - Verify integer division (13)")
    void testDivision13() {
        int result = 540 / 18;
        assertEquals(30, result, "540 / 18 should equal 30");
    }

    @Test
    @DisplayName("PASS - Verify positive number (13)")
    void testPositiveNumber13() {
        int number = 262;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (13)")
    void testNegativeNumber13() {
        int number = -54;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (13)")
    void testStringNotEmpty13() {
        String text = "QualityCheck13";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (13)")
    void testStringEqualitySuccess13() {
        String actual = "QualityCheck13";
        assertEquals("QualityCheck13", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (13)")
    void testStringContains13() {
        String text = "QualityCheck13 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (13)")
    void testStringStartsWith13() {
        String text = "QualityCheck13";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (13)")
    void testListSizeSuccess13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (13)")
    void testListContainsSuccess13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertTrue(items.contains("TestNG13"),
                "The list should contain TestNG13");
    }

    @Test
    @DisplayName("PASS - Verify first list element (13)")
    void testFirstListElement13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertEquals("Python13", items.get(0),
                "The first element should be Python13");
    }

    @Test
    @DisplayName("PASS - Verify last list element (13)")
    void testLastListElement13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertEquals("Cypress13", items.get(2),
                "The last element should be Cypress13");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (13)")
    void testBooleanTrue13() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (13)")
    void testBooleanFalse13() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (13)")
    void testNotNull13() {
        String value = "QualityCheck13";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (13)")
    void testIsNull13() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (13)")
    void testArrayLength13() {
        int[] numbers = {17, 27, 37, 47, 57};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (13)")
    void testArrayElement13() {
        int[] numbers = {17, 27, 37};

        assertEquals(27, numbers[1],
                "The second element should be 27");
    }

    @Test
    @DisplayName("PASS - Verify addition (14)")
    void testAddition14() {
        int result = 20 + 34;
        assertEquals(54, result, "20 + 34 should equal 54");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (14)")
    void testSubtraction14() {
        int result = 115 - 28;
        assertEquals(87, result, "115 - 28 should equal 87");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (14)")
    void testMultiplication14() {
        int result = 19 * 20;
        assertEquals(380, result, "19 * 20 should equal 380");
    }

    @Test
    @DisplayName("PASS - Verify integer division (14)")
    void testDivision14() {
        int result = 608 / 19;
        assertEquals(32, result, "608 / 19 should equal 32");
    }

    @Test
    @DisplayName("PASS - Verify positive number (14)")
    void testPositiveNumber14() {
        int number = 263;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (14)")
    void testNegativeNumber14() {
        int number = -55;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (14)")
    void testStringNotEmpty14() {
        String text = "QualityCheck14";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (14)")
    void testStringEqualitySuccess14() {
        String actual = "QualityCheck14";
        assertEquals("QualityCheck14", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (14)")
    void testStringContains14() {
        String text = "QualityCheck14 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (14)")
    void testStringStartsWith14() {
        String text = "QualityCheck14";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (14)")
    void testListSizeSuccess14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (14)")
    void testListContainsSuccess14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertTrue(items.contains("TestNG14"),
                "The list should contain TestNG14");
    }

    @Test
    @DisplayName("PASS - Verify first list element (14)")
    void testFirstListElement14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertEquals("Python14", items.get(0),
                "The first element should be Python14");
    }

    @Test
    @DisplayName("PASS - Verify last list element (14)")
    void testLastListElement14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertEquals("Cypress14", items.get(2),
                "The last element should be Cypress14");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (14)")
    void testBooleanTrue14() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (14)")
    void testBooleanFalse14() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (14)")
    void testNotNull14() {
        String value = "QualityCheck14";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (14)")
    void testIsNull14() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (14)")
    void testArrayLength14() {
        int[] numbers = {18, 28, 38, 48, 58};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (14)")
    void testArrayElement14() {
        int[] numbers = {18, 28, 38};

        assertEquals(28, numbers[1],
                "The second element should be 28");
    }

    @Test
    @DisplayName("PASS - Verify addition (15)")
    void testAddition15() {
        int result = 21 + 36;
        assertEquals(57, result, "21 + 36 should equal 57");
    }

    @Test
    @DisplayName("PASS - Verify subtraction (15)")
    void testSubtraction15() {
        int result = 120 - 29;
        assertEquals(91, result, "120 - 29 should equal 91");
    }

    @Test
    @DisplayName("PASS - Verify multiplication (15)")
    void testMultiplication15() {
        int result = 20 * 21;
        assertEquals(420, result, "20 * 21 should equal 420");
    }

    @Test
    @DisplayName("PASS - Verify integer division (15)")
    void testDivision15() {
        int result = 680 / 20;
        assertEquals(34, result, "680 / 20 should equal 34");
    }

    @Test
    @DisplayName("PASS - Verify positive number (15)")
    void testPositiveNumber15() {
        int number = 264;
        assertTrue(number > 0, "The number should be positive");
    }

    @Test
    @DisplayName("PASS - Verify negative number (15)")
    void testNegativeNumber15() {
        int number = -56;
        assertTrue(number < 0, "The number should be negative");
    }

    @Test
    @DisplayName("PASS - Verify string is not empty (15)")
    void testStringNotEmpty15() {
        String text = "QualityCheck15";
        assertFalse(text.isEmpty(), "The string should not be empty");
    }

    @Test
    @DisplayName("PASS - Verify string equality (15)")
    void testStringEqualitySuccess15() {
        String actual = "QualityCheck15";
        assertEquals("QualityCheck15", actual, "The strings should be equal");
    }

    @Test
    @DisplayName("PASS - Verify string contains text (15)")
    void testStringContains15() {
        String text = "QualityCheck15 Suite";
        assertTrue(text.contains("Check"),
                "The string should contain 'Check'");
    }

    @Test
    @DisplayName("PASS - Verify string starts with expected text (15)")
    void testStringStartsWith15() {
        String text = "QualityCheck15";
        assertTrue(text.startsWith("Quality"),
                "The string should start with 'Quality'");
    }

    @Test
    @DisplayName("PASS - Verify list size (15)")
    void testListSizeSuccess15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("PASS - Verify list contains an element (15)")
    void testListContainsSuccess15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertTrue(items.contains("TestNG15"),
                "The list should contain TestNG15");
    }

    @Test
    @DisplayName("PASS - Verify first list element (15)")
    void testFirstListElement15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertEquals("Python15", items.get(0),
                "The first element should be Python15");
    }

    @Test
    @DisplayName("PASS - Verify last list element (15)")
    void testLastListElement15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertEquals("Cypress15", items.get(2),
                "The last element should be Cypress15");
    }

    @Test
    @DisplayName("PASS - Verify Boolean true condition (15)")
    void testBooleanTrue15() {
        boolean isActive = true;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("PASS - Verify Boolean false condition (15)")
    void testBooleanFalse15() {
        boolean isDisabled = false;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("PASS - Verify object is not null (15)")
    void testNotNull15() {
        String value = "QualityCheck15";

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("PASS - Verify null object (15)")
    void testIsNull15() {
        String value = null;

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("PASS - Verify array length (15)")
    void testArrayLength15() {
        int[] numbers = {19, 29, 39, 49, 59};

        assertEquals(5, numbers.length,
                "The array should contain 5 elements");
    }

    @Test
    @DisplayName("PASS - Verify array element (15)")
    void testArrayElement15() {
        int[] numbers = {19, 29, 39};

        assertEquals(29, numbers[1],
                "The second element should be 29");
    }


    // =========================================================
    // ======================= FAILED =========================
    // ======================= 100 CASES =======================
    // =========================================================

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (11)")
    void testAdditionWrongExpected11() {
        int result = 17 + 28;

        assertEquals(50, result,
                "17 + 28 should equal 50");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (11)")
    void testSubtractionWrongExpected11() {
        int result = 100 - 25;

        assertEquals(100, result,
                "100 - 25 should equal 100");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (11)")
    void testMultiplicationWrongExpected11() {
        int result = 16 * 17;

        assertEquals(280, result,
                "16 * 17 should equal 280");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (11)")
    void testDivisionWrongExpected11() {
        int result = 416 / 16;

        assertEquals(30, result,
                "416 / 16 should equal 30");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (11)")
    void testPositiveNumberFailed11() {
        int number = -18;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (11)")
    void testNegativeNumberFailed11() {
        int number = 40;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (11)")
    void testStringEqualityFailed11() {
        String actual = "QualityCheck11";

        assertEquals("World11",
                actual,
                "The string should be World11");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (11)")
    void testStringContainsFailed11() {
        String text = "QualityCheck11";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (11)")
    void testStringStartsWithFailed11() {
        String text = "QualityCheck11";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (11)")
    void testStringEndsWithFailed11() {
        String text = "QualityCheck11";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (11)")
    void testListSizeFailed11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (11)")
    void testListContainsFailed11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (11)")
    void testFirstListElementFailed11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (11)")
    void testLastListElementFailed11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11",
                "Cypress11"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (11)")
    void testBooleanTrueFailed11() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (11)")
    void testBooleanFalseFailed11() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (11)")
    void testNotNullFailed11() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (11)")
    void testIsNullFailed11() {
        String value = "QualityCheck11";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (11)")
    void testArrayLengthFailed11() {
        int[] numbers = {15, 25, 35, 45, 55};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (11)")
    void testArrayElementFailed11() {
        int[] numbers = {15, 25, 35};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (12)")
    void testAdditionWrongExpected12() {
        int result = 18 + 30;

        assertEquals(53, result,
                "18 + 30 should equal 53");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (12)")
    void testSubtractionWrongExpected12() {
        int result = 105 - 26;

        assertEquals(105, result,
                "105 - 26 should equal 105");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (12)")
    void testMultiplicationWrongExpected12() {
        int result = 17 * 18;

        assertEquals(314, result,
                "17 * 18 should equal 314");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (12)")
    void testDivisionWrongExpected12() {
        int result = 476 / 17;

        assertEquals(32, result,
                "476 / 17 should equal 32");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (12)")
    void testPositiveNumberFailed12() {
        int number = -19;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (12)")
    void testNegativeNumberFailed12() {
        int number = 41;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (12)")
    void testStringEqualityFailed12() {
        String actual = "QualityCheck12";

        assertEquals("World12",
                actual,
                "The string should be World12");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (12)")
    void testStringContainsFailed12() {
        String text = "QualityCheck12";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (12)")
    void testStringStartsWithFailed12() {
        String text = "QualityCheck12";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (12)")
    void testStringEndsWithFailed12() {
        String text = "QualityCheck12";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (12)")
    void testListSizeFailed12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (12)")
    void testListContainsFailed12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (12)")
    void testFirstListElementFailed12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (12)")
    void testLastListElementFailed12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12",
                "Cypress12"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (12)")
    void testBooleanTrueFailed12() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (12)")
    void testBooleanFalseFailed12() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (12)")
    void testNotNullFailed12() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (12)")
    void testIsNullFailed12() {
        String value = "QualityCheck12";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (12)")
    void testArrayLengthFailed12() {
        int[] numbers = {16, 26, 36, 46, 56};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (12)")
    void testArrayElementFailed12() {
        int[] numbers = {16, 26, 36};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (13)")
    void testAdditionWrongExpected13() {
        int result = 19 + 32;

        assertEquals(56, result,
                "19 + 32 should equal 56");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (13)")
    void testSubtractionWrongExpected13() {
        int result = 110 - 27;

        assertEquals(110, result,
                "110 - 27 should equal 110");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (13)")
    void testMultiplicationWrongExpected13() {
        int result = 18 * 19;

        assertEquals(350, result,
                "18 * 19 should equal 350");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (13)")
    void testDivisionWrongExpected13() {
        int result = 540 / 18;

        assertEquals(34, result,
                "540 / 18 should equal 34");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (13)")
    void testPositiveNumberFailed13() {
        int number = -20;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (13)")
    void testNegativeNumberFailed13() {
        int number = 42;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (13)")
    void testStringEqualityFailed13() {
        String actual = "QualityCheck13";

        assertEquals("World13",
                actual,
                "The string should be World13");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (13)")
    void testStringContainsFailed13() {
        String text = "QualityCheck13";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (13)")
    void testStringStartsWithFailed13() {
        String text = "QualityCheck13";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (13)")
    void testStringEndsWithFailed13() {
        String text = "QualityCheck13";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (13)")
    void testListSizeFailed13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (13)")
    void testListContainsFailed13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (13)")
    void testFirstListElementFailed13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (13)")
    void testLastListElementFailed13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13",
                "Cypress13"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (13)")
    void testBooleanTrueFailed13() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (13)")
    void testBooleanFalseFailed13() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (13)")
    void testNotNullFailed13() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (13)")
    void testIsNullFailed13() {
        String value = "QualityCheck13";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (13)")
    void testArrayLengthFailed13() {
        int[] numbers = {17, 27, 37, 47, 57};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (13)")
    void testArrayElementFailed13() {
        int[] numbers = {17, 27, 37};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (14)")
    void testAdditionWrongExpected14() {
        int result = 20 + 34;

        assertEquals(59, result,
                "20 + 34 should equal 59");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (14)")
    void testSubtractionWrongExpected14() {
        int result = 115 - 28;

        assertEquals(115, result,
                "115 - 28 should equal 115");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (14)")
    void testMultiplicationWrongExpected14() {
        int result = 19 * 20;

        assertEquals(388, result,
                "19 * 20 should equal 388");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (14)")
    void testDivisionWrongExpected14() {
        int result = 608 / 19;

        assertEquals(36, result,
                "608 / 19 should equal 36");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (14)")
    void testPositiveNumberFailed14() {
        int number = -21;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (14)")
    void testNegativeNumberFailed14() {
        int number = 43;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (14)")
    void testStringEqualityFailed14() {
        String actual = "QualityCheck14";

        assertEquals("World14",
                actual,
                "The string should be World14");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (14)")
    void testStringContainsFailed14() {
        String text = "QualityCheck14";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (14)")
    void testStringStartsWithFailed14() {
        String text = "QualityCheck14";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (14)")
    void testStringEndsWithFailed14() {
        String text = "QualityCheck14";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (14)")
    void testListSizeFailed14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (14)")
    void testListContainsFailed14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (14)")
    void testFirstListElementFailed14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (14)")
    void testLastListElementFailed14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14",
                "Cypress14"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (14)")
    void testBooleanTrueFailed14() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (14)")
    void testBooleanFalseFailed14() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (14)")
    void testNotNullFailed14() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (14)")
    void testIsNullFailed14() {
        String value = "QualityCheck14";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (14)")
    void testArrayLengthFailed14() {
        int[] numbers = {18, 28, 38, 48, 58};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (14)")
    void testArrayElementFailed14() {
        int[] numbers = {18, 28, 38};

        assertEquals(99, numbers[1],
                "The second element should be 99");
    }

    @Test
    @DisplayName("FAILED - Addition with incorrect expected value (15)")
    void testAdditionWrongExpected15() {
        int result = 21 + 36;

        assertEquals(62, result,
                "21 + 36 should equal 62");
    }

    @Test
    @DisplayName("FAILED - Subtraction with incorrect expected value (15)")
    void testSubtractionWrongExpected15() {
        int result = 120 - 29;

        assertEquals(120, result,
                "120 - 29 should equal 120");
    }

    @Test
    @DisplayName("FAILED - Multiplication with incorrect expected value (15)")
    void testMultiplicationWrongExpected15() {
        int result = 20 * 21;

        assertEquals(428, result,
                "20 * 21 should equal 428");
    }

    @Test
    @DisplayName("FAILED - Division with incorrect expected value (15)")
    void testDivisionWrongExpected15() {
        int result = 680 / 20;

        assertEquals(38, result,
                "680 / 20 should equal 38");
    }

    @Test
    @DisplayName("FAILED - Positive number condition is incorrect (15)")
    void testPositiveNumberFailed15() {
        int number = -22;

        assertTrue(number > 0,
                "The number should be positive");
    }

    @Test
    @DisplayName("FAILED - Negative number condition is incorrect (15)")
    void testNegativeNumberFailed15() {
        int number = 44;

        assertTrue(number < 0,
                "The number should be negative");
    }

    @Test
    @DisplayName("FAILED - String equality mismatch (15)")
    void testStringEqualityFailed15() {
        String actual = "QualityCheck15";

        assertEquals("World15",
                actual,
                "The string should be World15");
    }

    @Test
    @DisplayName("FAILED - String should contain expected text (15)")
    void testStringContainsFailed15() {
        String text = "QualityCheck15";

        assertTrue(text.contains("Cypress"),
                "The string should contain Cypress");
    }

    @Test
    @DisplayName("FAILED - String should start with expected text (15)")
    void testStringStartsWithFailed15() {
        String text = "QualityCheck15";

        assertTrue(text.startsWith("TestNG"),
                "The string should start with TestNG");
    }

    @Test
    @DisplayName("FAILED - String should end with expected text (15)")
    void testStringEndsWithFailed15() {
        String text = "QualityCheck15";

        assertTrue(text.endsWith("Python"),
                "The string should end with Python");
    }

    @Test
    @DisplayName("FAILED - Incorrect list size (15)")
    void testListSizeFailed15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15"
        );

        assertEquals(3, items.size(),
                "The list should contain 3 elements");
    }

    @Test
    @DisplayName("FAILED - List should contain missing element (15)")
    void testListContainsFailed15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertTrue(items.contains("Ruby"),
                "The list should contain Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect first list element (15)")
    void testFirstListElementFailed15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertEquals("Ruby", items.get(0),
                "The first element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Incorrect last list element (15)")
    void testLastListElementFailed15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15",
                "Cypress15"
        );

        assertEquals("Ruby", items.get(2),
                "The last element should be Ruby");
    }

    @Test
    @DisplayName("FAILED - Boolean true condition (15)")
    void testBooleanTrueFailed15() {
        boolean isActive = false;

        assertTrue(isActive,
                "The active status should be true");
    }

    @Test
    @DisplayName("FAILED - Boolean false condition (15)")
    void testBooleanFalseFailed15() {
        boolean isDisabled = true;

        assertFalse(isDisabled,
                "The disabled status should be false");
    }

    @Test
    @DisplayName("FAILED - Object should not be null (15)")
    void testNotNullFailed15() {
        String value = null;

        assertNotNull(value,
                "The value should not be null");
    }

    @Test
    @DisplayName("FAILED - Object should be null (15)")
    void testIsNullFailed15() {
        String value = "QualityCheck15";

        assertNull(value,
                "The value should be null");
    }

    @Test
    @DisplayName("FAILED - Incorrect array length (15)")
    void testArrayLengthFailed15() {
        int[] numbers = {19, 29, 39, 49, 59};

        assertEquals(10, numbers.length,
                "The array should contain 10 elements");
    }

    @Test
    @DisplayName("FAILED - Incorrect array element (15)")
    void testArrayElementFailed15() {
        int[] numbers = {19, 29, 39};

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
    @DisplayName("ERROR - Division by zero (11)")
    void testDivisionByZero11() {
        int result = 35 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (11)")
    void testNullPointerAccess11() {
        String text = null;

        int length = text.length();

        assertEquals(20, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (11)")
    void testArrayOutOfBounds11() {
        int[] numbers = {5, 15, 25};

        int value = numbers[18];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (11)")
    void testInvalidNumberFormat11() {
        String value = "QualityCheck11";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (11)")
    void testListIndexOutOfBounds11() {
        List<String> items = Arrays.asList(
                "Python11",
                "TestNG11"
        );

        String item = items.get(19);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (11)")
    void testNegativeArraySize11() {
        int size = -22;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (11)")
    void testStringIndexOutOfBounds11() {
        String text = "TestNG11";

        char character = text.charAt(30);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (11)")
    void testRemoveFromEmptyList11() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (11)")
    void testInvalidArrayAccess11() {
        String[] tools = {
                "TestNG11",
                "Cypress11",
                "Postman11"
        };

        String tool = tools[25];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (11)")
    void testInvalidArithmeticOperation11() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (12)")
    void testDivisionByZero12() {
        int result = 36 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (12)")
    void testNullPointerAccess12() {
        String text = null;

        int length = text.length();

        assertEquals(21, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (12)")
    void testArrayOutOfBounds12() {
        int[] numbers = {5, 15, 25};

        int value = numbers[19];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (12)")
    void testInvalidNumberFormat12() {
        String value = "QualityCheck12";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (12)")
    void testListIndexOutOfBounds12() {
        List<String> items = Arrays.asList(
                "Python12",
                "TestNG12"
        );

        String item = items.get(20);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (12)")
    void testNegativeArraySize12() {
        int size = -23;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (12)")
    void testStringIndexOutOfBounds12() {
        String text = "TestNG12";

        char character = text.charAt(31);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (12)")
    void testRemoveFromEmptyList12() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (12)")
    void testInvalidArrayAccess12() {
        String[] tools = {
                "TestNG12",
                "Cypress12",
                "Postman12"
        };

        String tool = tools[26];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (12)")
    void testInvalidArithmeticOperation12() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (13)")
    void testDivisionByZero13() {
        int result = 37 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (13)")
    void testNullPointerAccess13() {
        String text = null;

        int length = text.length();

        assertEquals(22, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (13)")
    void testArrayOutOfBounds13() {
        int[] numbers = {5, 15, 25};

        int value = numbers[20];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (13)")
    void testInvalidNumberFormat13() {
        String value = "QualityCheck13";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (13)")
    void testListIndexOutOfBounds13() {
        List<String> items = Arrays.asList(
                "Python13",
                "TestNG13"
        );

        String item = items.get(21);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (13)")
    void testNegativeArraySize13() {
        int size = -24;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (13)")
    void testStringIndexOutOfBounds13() {
        String text = "TestNG13";

        char character = text.charAt(32);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (13)")
    void testRemoveFromEmptyList13() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (13)")
    void testInvalidArrayAccess13() {
        String[] tools = {
                "TestNG13",
                "Cypress13",
                "Postman13"
        };

        String tool = tools[27];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (13)")
    void testInvalidArithmeticOperation13() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (14)")
    void testDivisionByZero14() {
        int result = 38 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (14)")
    void testNullPointerAccess14() {
        String text = null;

        int length = text.length();

        assertEquals(23, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (14)")
    void testArrayOutOfBounds14() {
        int[] numbers = {5, 15, 25};

        int value = numbers[21];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (14)")
    void testInvalidNumberFormat14() {
        String value = "QualityCheck14";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (14)")
    void testListIndexOutOfBounds14() {
        List<String> items = Arrays.asList(
                "Python14",
                "TestNG14"
        );

        String item = items.get(22);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (14)")
    void testNegativeArraySize14() {
        int size = -25;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (14)")
    void testStringIndexOutOfBounds14() {
        String text = "TestNG14";

        char character = text.charAt(33);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (14)")
    void testRemoveFromEmptyList14() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (14)")
    void testInvalidArrayAccess14() {
        String[] tools = {
                "TestNG14",
                "Cypress14",
                "Postman14"
        };

        String tool = tools[28];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (14)")
    void testInvalidArithmeticOperation14() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }

    @Test
    @DisplayName("ERROR - Division by zero (15)")
    void testDivisionByZero15() {
        int result = 39 / 0;

        assertEquals(5, result);
    }

    @Test
    @DisplayName("ERROR - NullPointerException (15)")
    void testNullPointerAccess15() {
        String text = null;

        int length = text.length();

        assertEquals(24, length);
    }

    @Test
    @DisplayName("ERROR - Array index out of bounds (15)")
    void testArrayOutOfBounds15() {
        int[] numbers = {5, 15, 25};

        int value = numbers[22];

        assertEquals(15, value);
    }

    @Test
    @DisplayName("ERROR - Invalid number format (15)")
    void testInvalidNumberFormat15() {
        String value = "QualityCheck15";

        int number = Integer.parseInt(value);

        assertEquals(200, number);
    }

    @Test
    @DisplayName("ERROR - List index out of bounds (15)")
    void testListIndexOutOfBounds15() {
        List<String> items = Arrays.asList(
                "Python15",
                "TestNG15"
        );

        String item = items.get(23);

        assertEquals("Cypress", item);
    }

    @Test
    @DisplayName("ERROR - Negative array size (15)")
    void testNegativeArraySize15() {
        int size = -26;

        int[] numbers = new int[size];

        assertEquals(12, numbers.length);
    }

    @Test
    @DisplayName("ERROR - String index out of bounds (15)")
    void testStringIndexOutOfBounds15() {
        String text = "TestNG15";

        char character = text.charAt(34);

        assertEquals('T', character);
    }

    @Test
    @DisplayName("ERROR - Remove element from empty list (15)")
    void testRemoveFromEmptyList15() {
        List<String> items = new ArrayList<>();

        items.remove(0);

        assertTrue(items.isEmpty());
    }

    @Test
    @DisplayName("ERROR - Invalid array access (15)")
    void testInvalidArrayAccess15() {
        String[] tools = {
                "TestNG15",
                "Cypress15",
                "Postman15"
        };

        String tool = tools[29];

        assertEquals("Python", tool);
    }

    @Test
    @DisplayName("ERROR - Arithmetic operation with invalid value (15)")
    void testInvalidArithmeticOperation15() {
        int number = Integer.MIN_VALUE;

        // This expression intentionally causes an exception
        int result = number / 0;

        assertEquals(0, result);
    }
}
