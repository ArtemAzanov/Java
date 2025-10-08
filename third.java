public class third {
    public static void main(String[] args) {
        int counter = 0;
        double y;
        for (double x = -4; x <= 4; x += 0.5) {
            if (x <= 0) {
                y = Math.pow(x, 2) - 1;
                System.out.println(" ;Ответ: " + y);
            } else if (0 <= x && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(" ;Ответ: " + y);
            } else {
                if (x > 1.5)
                    ;
                y = Math.sin(x - 1);
                System.out.println(" ;Ответ: " + y);
            }
            if (y > 0) {
                counter++;
                System.out.println(" ;Ответ: " + counter);
            }
        }

        double x = -4;
        while (x <= 4) {
            if (x <= 0) {
                y = Math.pow(x, 2) - 1;
                System.out.println(" ;Ответ: " + y);
            } else if (0 < x && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(" ;Ответ: " + y);
            } else if (x > 1.5) {
                y = Math.sin(x - 1);
                System.out.println(" ;Ответ: " + y);
            }

            x += 0.5;
        }
         x = -4;
        do {
            if (x <= 0) {
                y = Math.pow(x, 2) - 1;
                System.out.println(" ;Ответ: " + y);
            } else if (0 < x && x <= 1.5) {
                y = Math.cos(x);
                System.out.println(" ;Ответ: " + y);
            } else if (x > 1.5) {
                y = Math.sin(x - 1);
                System.out.println(" ;Ответ: " + y);
            }
            x += 0.5;
        } while (x <= 4);
    }
}
