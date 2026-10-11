import java.util.Scanner;

public class Task5 {

    private static final int WEIGHT_INDEX = 0;
    private static final int HEIGHT_INDEX = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            printMenu();
            System.out.print("Выберите пункт: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число от 1 до 4.\n");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 1) {
                double[] params = readParameters(scanner); // Ввод параметров в массив
                double bmi = calculateBmi(params); // Вычисление
                printResults(params, bmi); // Вывод результатов

            } else if (choice == 2) {
                showAbout();

            } else if (choice == 3) {
                showAuthor();

            } else if (choice == 4) {
                System.out.println("Выход из программы.");

            } else {
                System.out.println("Ошибка: такого пункта нет в меню.\n");
            }
        }

        scanner.close();
    }

    // Меню и методы с доп информацией

    static void printMenu() {
        System.out.println("МЕНЮ");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
    }

    static void showAbout() {
        System.out.println("\nПрограмма для расчёта индекса массы тела (ИМТ).\n");
    }

    static void showAuthor() {
        System.out.println("\nРазработчик: Студент\nГруппа: Ваша группа\n");
    }

    // Проверка валидности данных
    static boolean isValid(double value) {
        return value > 0;
    }

    // Ввод
    static double[] readParameters(Scanner scanner) {
        // [0] - вес , [1] - рост
        double[] params = new double[2];

        params[WEIGHT_INDEX] = readValidatedDouble(scanner, "Введите ваш вес в кг: ");
        params[HEIGHT_INDEX] = readValidatedDouble(scanner, "Введите ваш рост в метрах: ");

        return params;
    }

    static double readValidatedDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);

            if (!scanner.hasNextDouble()) {
                System.out.println("Ошибка: введите корректное число.");
                scanner.next();
                continue;
            }

            double val = scanner.nextDouble();

            if (!isValid(val)) {
                System.out.println("Ошибка: значение должно быть строго больше нуля.");
                continue;
            }

            return val;
        }
    }

    // Вычисление
    static double calculateBmi(double[] params) {
        double weight = params[WEIGHT_INDEX];
        double height = params[HEIGHT_INDEX];
        return weight / (height * height);
    }

    // Вывод
    static void printResults(double[] params, double bmi) {
        System.out.println("\nРезультаты: ");
        System.out.printf("Параметры: вес = %.2f кг, рост = %.2f м%n", params[WEIGHT_INDEX], params[HEIGHT_INDEX]);
        System.out.printf("Ваш ИМТ: %.2f%n", bmi);
        System.out.print("Категория: ");
        printCategory(bmi);
    }

    static void printCategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Недостаточная масса тела");
        } else if (bmi < 25.0) {
            System.out.println("Нормальная масса тела");
        } else if (bmi < 30.0) {
            System.out.println("Избыточная масса тела");
        } else {
            System.out.println("Ожирение");
        }
    }
}