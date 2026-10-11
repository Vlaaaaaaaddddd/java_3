import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        double[] a = new double[n];
        System.out.println("По отдельности вводите числа для заполнения массива");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }

        double[] b = createArrayB(a);

        for (double val : b) {
            System.out.print(val + " ");
        }
    }

    public static double[] createArrayB(double[] a) {
        double[] b = new double[a.length];

        for (int k = 0; k < a.length; k++) {
            if (a[k] < 5) {
                b[k] = 2 * a[k];
            } else {
                b[k] = a[k] / 2.0;
            }
        }

        return b;
    }
}
