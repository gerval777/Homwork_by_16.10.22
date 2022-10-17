
public class Main {
    public static void main(String[] args) {

//Массивы ч.2 Генератор случайных чисел + решение всех задач

        int[] arr = generateRandomArray();
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void task1() {
//Массивы ч.2 Задача 1
        System.out.println("Массивы ч.2 Задача 1");

        int sum = 0;
        int arr[] = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц: " + sum);
    }

    public static void task2() {
//Массивы ч.2 Задача 2
        System.out.println("Массивы ч.2 Задача 2");

        int arr[] = generateRandomArray();
        int minExpensesDay = arr[0];
        int maxExpensesDay = arr[0];

        for (int element : arr) {
            if (element < minExpensesDay) {
                minExpensesDay = element;
            } else if (element > maxExpensesDay) {
                maxExpensesDay = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpensesDay + " рублей. Максимальная сумма трат за день составила " + maxExpensesDay + " рублей.");
    }

    public static void task3() {
//Массивы ч.2 Задача 3
        System.out.println("Массивы ч.2 Задача 3");

        int arr[] = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей");
    }

    public static void task4() {
//Массивы ч.2 Задача 4
        System.out.println("Массивы ч.2 Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);
        }
    }
}