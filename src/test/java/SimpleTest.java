import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    // ===== PASSED (5 case) =====

    @Test
    @DisplayName("Kiểm tra phép cộng cơ bản - Case thành công")
    void testAdditionSuccess() {
        System.out.println("Đang chạy: testAdditionSuccess");
        assertEquals(5, 2 + 3, "2 + 3 phải bằng 5");
    }

    @Test
    @DisplayName("Kiểm tra chuỗi rỗng - Case thành công")
    void testStringNotEmpty() {
        String data = "AgileTest Practice";
        assertFalse(data.isEmpty());
    }

    @Test
    @DisplayName("Kiểm tra phép trừ - Case thành công")
    void testSubtractionSuccess() {
        System.out.println("Đang chạy: testSubtractionSuccess");
        assertEquals(15, 20 - 5, "20 - 5 phải bằng 15");
    }

    @Test
    @DisplayName("Kiểm tra phép tính số nguyên - Case thành công")
    void testRuntimeError() {
        System.out.println("Đang chạy: testRuntimeError");
        int result = 10 / 2;
        assertEquals(5, result, "10 / 2 phải bằng 5");
    }

    @Test
    @DisplayName("Kiểm tra tính đúng đắn của logic - Case thành công")
    void testBooleanLogic() {
        boolean isLearningAgileTest = true;
        assertTrue(isLearningAgileTest, "Pnam đang học AgileTest rất tốt !");
    }

    // ===== FAILED (4 case) =====

    @Test
    @DisplayName("Kiểm tra phép cộng - Case FAILED: expected sai")
    void testAdditionWrongExpected() {
        assertEquals(6, 2 + 3, "2 + 3 phải bằng 6");
    }

    @Test
    @DisplayName("Kiểm tra so sánh chuỗi - Case FAILED: giá trị không khớp")
    void testStringEquality() {
        String actual = "AgileTest";
        assertEquals("Hello", actual, "Chuỗi phải là Hello");
    }

    @Test
    @DisplayName("Kiểm tra kích thước danh sách - Case FAILED: size sai")
    void testListSize() {
        List<String> items = Arrays.asList("Java", "JUnit");
        assertEquals(3, items.size(), "Danh sách phải có 3 phần tử");
    }

    @Test
    @DisplayName("Kiểm tra đối tượng null - Case FAILED: assertNotNull")
    void testNullCheck() {
        String value = null;
        // value là null → FAIL
        assertNotNull(value, "Giá trị không được phép là null");
    }

    // ===== ERROR (exception không được xử lý — test crash) =====

    @Test
    @DisplayName("Kiểm tra chia cho 0 - Case ERROR: ArithmeticException")
    void testDivisionByZero() {
        System.out.println("Đang chạy: testDivisionByZero");
        int result = 10 / 0;
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Kiểm tra truy cập null object - Case ERROR: NullPointerException")
    void testNullPointerAccess() {
        System.out.println("Đang chạy: testNullPointerAccess");
        String text = null;
        int length = text.length();
        assertEquals(5, length);
    }

    @Test
    @DisplayName("Kiểm tra truy cập mảng - Case ERROR: ArrayIndexOutOfBoundsException")
    void testArrayOutOfBounds() {
        System.out.println("Đang chạy: testArrayOutOfBounds");
        int[] arr = {10, 20, 30};
        int value = arr[5];
        assertEquals(20, value);
    }
}
