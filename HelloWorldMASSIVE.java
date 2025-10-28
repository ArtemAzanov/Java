import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "UTF-8");

         double array[] = {5, -2, 0, 3, 4, 12, 7};
    double summa = 0;
    double polozh = 0;
    double size = 7;
    for (int i = 0; i < size; i++) {
        if (array[i] > 0) {
            summa += array[i];
            polozh++;
        }
    }
    double W = summa / polozh;
    for (int i = 0; i < size; i++) {
        if (array[i] > W) {
            array[i] = W;
        }
    }
    for (int i = 0; i < size; i++) {
        System.out.println(array[i]);
    }
    System.out.println("Среднее арифметическое чисел " + W);
        scanner.close();
    }
}