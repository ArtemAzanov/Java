import java.util.Scanner;
import java.lang.Math;

public class fourth {

    public static double raschet(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double tema(double a, double b, double c) {
        double p = raschet(a, b, c);
        return Math.sqrt(((p - a) * (p - b)) / (p * (p - c)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("Введите число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число: ");
        double b = scanner.nextDouble();
        System.out.print("Введите число: ");
        double c = scanner.nextDouble();
        double result = tema(a, b, c);
        System.out.print("Ответ: " + result);
        scanner.close();

    }
}
