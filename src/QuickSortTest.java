import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testSortEmptyList() {
        List<Integer> result = QuickSort.sort(List.of());
        assertTrue(result.isEmpty());
    }

    @Test
    void testSortWithDuplicates() {
        List<Integer> input = List.of(3, 1, 3, 2);
        List<Integer> expected = List.of(1, 2, 3, 3);
        assertEquals(expected, QuickSort.sort(input));
    }

    @Test
    void testSortReverseOrder() {
        List<Integer> input = List.of(5, 4, 3, 2, 1);
        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        assertEquals(expected, QuickSort.sort(input));
    }
}