import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Введите число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число: ");
        double y = scanner.nextDouble();
        System.out.print("Введите число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число: ");
        double b = scanner.nextDouble();
        double maxEl;
        double minEl;
        if (x > 0 && y > 0) {
            maxEl = a / x;
            if (maxEl < b / x) {
                maxEl = b / x;
            }
            if (maxEl < Math.sqrt(y)) {
                maxEl = Math.sqrt(y);
                double z = maxEl;
                System.out.print("Ответ: " + z);
            }
        } else if (x < 0 && y > 0) {
            minEl = a * Math.pow(x, 3);
            if (minEl > b * Math.pow(y, 2)) {
                minEl = b * Math.pow(y, 2);
                double z = minEl;
                System.out.print("Ответ: " + z);
            }
        } else {
            double z = (Math.pow(2, x + y));
            System.out.print("Ответ: " + z);
        }

        scanner.close();
    }
}