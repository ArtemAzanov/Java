import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число: ");
        double y = scanner.nextDouble();
        double a = (14 * Math.sin(x) + Math.pow(y, 2)) / (0.92 * Math.pow(Math.cos(x), 3));
        System.out.print("Ответ: " + a);

        scanner.close();
    }
}
