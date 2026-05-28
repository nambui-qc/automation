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
    @DisplayName("Kiểm tra phép trừ - Case thành công")  // ✅ Đổi tên DisplayName
    void testSubtractionFail() {
        System.out.println("Đang chạy: testSubtractionFail");
        assertEquals(
                15,       // ✅ Sửa: 20 - 5 = 15 (không phải 20)
                20 - 5,
                "20 - 5 phải bằng 15"
        );
    }

    @Test
    @DisplayName("Kiểm tra phép tính số nguyên - Case thành công")  // ✅ Đổi tên DisplayName
    void testRuntimeError() {
        System.out.println("Đang chạy: testRuntimeError");
        int result = 10 / 2;   // ✅ Sửa: chia cho 2 thay vì 0
        assertEquals(5, result, "10 / 2 phải bằng 5");
    }

    @Test
    @DisplayName("Kiểm tra tính đúng đắn của logic - Case thành công")
    void testBooleanLogic() {
        boolean isLearningAgileTest = true;
        assertTrue(isLearningAgileTest, "Linh đang học AgileTest rất tốt!");
    }
}
