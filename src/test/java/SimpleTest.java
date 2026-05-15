import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class MassiveGeneratedTest {

    @TestFactory
    Collection<DynamicTest> generateMassiveTests() {

        Collection<DynamicTest> tests = new ArrayList<>();

        int totalTests = 7000;

        for (int i = 1; i <= totalTests; i++) {

            final int testId = i;

            // PASS CASE
            if (i % 10 != 0 && i % 15 != 0) {

                tests.add(
                    DynamicTest.dynamicTest(
                        "PASS_CASE_" + testId,
                        () -> {
                            assertEquals(testId, testId);
                        }
                    )
                );
            }

            // FAIL CASE
            else if (i % 10 == 0) {

                tests.add(
                    DynamicTest.dynamicTest(
                        "FAIL_CASE_" + testId,
                        () -> {
                            assertEquals(999, testId,
                                "Intentional fail for testing report");
                        }
                    )
                );
            }

            // ERROR CASE
            else {

                tests.add(
                    DynamicTest.dynamicTest(
                        "ERROR_CASE_" + testId,
                        () -> {
                            int x = 10 / 0;
                        }
                    )
                );
            }
        }

        return tests;
    }
}
