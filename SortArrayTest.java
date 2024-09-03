import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Arrays;

public class SortArrayTest {

    @Test
    void testFillArrayWithRandomNumbers_Length() {
        int[] numbers = new int[100];
        SortArray.fillArrayWithRandomNumbers(numbers);
        assertEquals(100, numbers.length);  // Verifica se o array tem 100 elementos
    }

    @Test
    void testFillArrayWithRandomNumbers_Range() {
        int[] numbers = new int[100];
        SortArray.fillArrayWithRandomNumbers(numbers);
        for (int num : numbers) {
            assertTrue(num >= 0 && num < 1000);  // Verifica se todos os números estão dentro do intervalo esperado
        }
    }

    @Test
    void testFillArrayWithRandomNumbers_Uniqueness() {
        int[] numbers = new int[100];
        SortArray.fillArrayWithRandomNumbers(numbers);
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        assertTrue(uniqueNumbers.size() > 1);  // Verifica se há mais de um número único no array
    }

    @Test
    void testFillArrayWithRandomNumbers_NonNull() {
        int[] numbers = new int[100];
        SortArray.fillArrayWithRandomNumbers(numbers);
        for (int num : numbers) {
            assertNotNull(num);  // Verifica se nenhum número no array é nulo
        }
    }

    @Test
    void testBubbleSort_CorrectOrder() {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortArray.bubbleSort(numbers);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, numbers);  // Verifica se o array está ordenado corretamente
    }

    @Test
    void testBubbleSort_EmptyArray() {
        int[] numbers = {};
        SortArray.bubbleSort(numbers);
        assertArrayEquals(new int[]{}, numbers);  // Verifica se o array vazio permanece vazio após a ordenação
    }

    @Test
    void testBubbleSort_SingleElement() {
        int[] numbers = {42};
        SortArray.bubbleSort(numbers);
        assertArrayEquals(new int[]{42}, numbers);  // Verifica se um array de um único elemento permanece inalterado
    }

    @Test
    void testBubbleSort_AlreadySorted() {
        int[] numbers = {1, 2, 3, 4, 5};
        SortArray.bubbleSort(numbers);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, numbers);  // Verifica se um array já ordenado permanece inalterado
    }

    @Test
    void testPrintArray_ValidOutput() {
        int[] numbers = {1, 2, 3, 4, 5};
        SortArray.printArray(numbers);  // Testa visualmente se os números são impressos corretamente
        // Não há assertiva para este método, pois ele apenas imprime no console
    }

    @Test
    void testPrintArray_EmptyArray() {
        int[] numbers = {};
        SortArray.printArray(numbers);  // Testa visualmente se um array vazio é impresso corretamente
        // Não há assertiva para este método, pois ele apenas imprime no console
    }

    @Test
    void testPrintArray_SingleElement() {
        int[] numbers = {42};
        SortArray.printArray(numbers);  // Testa visualmente se um array de um único elemento é impresso corretamente
        // Não há assertiva para este método, pois ele apenas imprime no console
    }

    @Test
    void testPrintArray_LargeArray() {
        int[] numbers = new int[100];
        Arrays.fill(numbers, 1);
        SortArray.printArray(numbers);  // Testa visualmente a impressão de um grande array com valores repetidos
        // Não há assertiva para este método, pois ele apenas imprime no console
    }
}
