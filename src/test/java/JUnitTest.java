import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @Test
    @DisplayName("1 + 2 는 3이다")
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        Assertions.assertEquals(a + b, sum);
    }
}
