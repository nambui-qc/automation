import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

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
    @DisplayName("Kiểm tra phép trừ - Đã sửa để thành công")
    void testSubtractionSuccess() {
        System.out.println("Đang chạy: testSubtractionSuccess");
        // Sửa từ 10 thành 15 để khớp với phép tính 20 - 5
        assertEquals(15, 20 - 5, "20 - 5 phải bằng 15");
    }

    @Test
    @DisplayName("Kiểm tra phép chia - Đã sửa để không còn lỗi")
    void testDivisionSuccess() {
        System.out.println("Đang chạy: testDivisionSuccess");
        // Thay vì chia cho 0 gây lỗi, ta chia cho 2
        int result = 10 / 2;
        assertEquals(5, result, "10 chia 2 phải bằng 5");
    }

    @Test
    @DisplayName("Kiểm tra tính đúng đắn của logic - Case thành công")
    void testBooleanLogic() {
        boolean isLearningAgileTest = true;
        assertTrue(isLearningAgileTest, "Bạn đang học AgileTest rất tốt!");
    }
}
