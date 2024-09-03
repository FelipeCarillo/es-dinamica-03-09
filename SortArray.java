import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        fillArrayWithRandomNumbers(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }

    private static void fillArrayWithRandomNumbers(int[] numbers) {
        Random rand = new Random();
        // Corrigido: Use 'i < numbers.length' para evitar ArrayIndexOutOfBoundsException
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Corrigido: 'j' deve começar em 0 para verificar todos os elementos
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // Corrigido: Simplificado para '!swapped'
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; // Corrigido: Adicionado para completar a troca
    }

    private static void printArray(int[] numbers) {
        System.out.println("Números ordenados:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
