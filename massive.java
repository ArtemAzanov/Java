import java.util.Scanner;

public class massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int[][] massive = {
            {2, 3, 6},
            {3, 9, 1},
            {1, 2, 3}
        };
        
        int[] y = new int[3];
        y[0] = massive[0][0];  
        y[1] = massive[1][1];  
        y[2] = massive[2][2];
        
        System.out.print("Диагональ: ");
        for(int num : y) System.out.print(num + " ");
        System.out.println();
        
        int max = y[0];
        if(y[1] > max) max = y[1];
        if(y[2] > max) max = y[2];
        System.out.println("Максимум: " + max);
        
        double[] result = new double[3];
        result[0] = (double)y[0] / max;
        result[1] = (double)y[1] / max;
        result[2] = (double)y[2] / max;
        
        System.out.print("Результат: ");
        for(double num : result) System.out.print(num + " ");
         scanner.close();
    }
}