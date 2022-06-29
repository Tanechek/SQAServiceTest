import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void testMinPositiveMaxPositive() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.squareAmount(200, 300);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMinNegativeMaxPositive() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.squareAmount(-200, 300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinPositiveMaxNegative() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareAmount(200, -300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinNegativeMaxNegative() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareAmount(-200, -300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinZeroMaxPositive() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.squareAmount(0, 300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinZeroMaxNegative() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareAmount(0, -300);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinNegativeMaxZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareAmount(-200, 0);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinPositiveMaxZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.squareAmount(200, 0);

        Assertions.assertEquals(expected, actual);
    }
}
