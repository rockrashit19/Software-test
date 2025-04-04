
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaylorSeriesTest {
    @Test
    void testCosAtZero() {
        double result = TaylorSeries.calculateCosSeries(0, 10);
        assertEquals(1, result, 1e-6);
    }

    @Test
    void testCosAtPi() {
        double result = TaylorSeries.calculateCosSeries(Math.PI, 20);
        assertEquals(-1, result, 1e-6);
    }

    @Test
    void testCosAtPiOver3() {
        double result = TaylorSeries.calculateCosSeries(Math.PI / 3, 15);
        assertEquals(0.5, result, 1e-6);
    }

    @Test
    void testCosPeriodicity() {
        double x = Math.PI / 4;
        double period = 2 * Math.PI;
        int N = 20;

        double result1 = TaylorSeries.calculateCosSeries(x, N);
        double result2 = TaylorSeries.calculateCosSeries(x + period, N);
        assertEquals(result1, result2, 1e-6, "Функция не периодична с периодом 2π");
    }
}
