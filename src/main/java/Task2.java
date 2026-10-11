import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива N: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println(0);
            return;
        }

        int[] a = new int[n];

        System.out.println("По отдельности вводите числа для заполнения массива");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        System.out.println(maxCount);
    }
}
