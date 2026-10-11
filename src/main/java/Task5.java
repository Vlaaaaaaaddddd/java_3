import java.util.Scanner;

public class Task5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int m = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("По отдельности вводите числа для заполнения матрицы");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                // Нечетный столбец
                for (int i = 0; i < m; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Четный столбец
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
