import java.util.Scanner;
public class Task1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("По отдельности вводите числа для заполнения массива");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Введите K: ");
        int k = scanner.nextInt();

        for (int i = k - 1; i < n; i += k) {
            System.out.print(a[i] + " ");
        }
    }
}
