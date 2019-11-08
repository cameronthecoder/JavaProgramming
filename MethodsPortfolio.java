public class MethodsPortfolio {
    public static void main(String[] args) {
        System.out.println("Math.pow(3.0, 2.0) = " + pow(3.0, 2.0));
        System.out.println("Math.sqrt(25.0) = " + sqrt(25.0));
        System.out.println("Math.max(6, 2) = " + max(6, 2));
        System.out.println("Math.max(-50.0, 7.0) = " + max(-50.0, 7.0));
        System.out.println("Math.random() = " + random());
        randomStudy();
    }
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }
    public static double sqrt(double x) {
        return Math.sqrt(x);
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static double max(double a, double b) {
        return Math.max(a, b);
    }
    public static double random() {
        return Math.random();
    }
    public static void randomStudy () {
        int total = 0;
        int min = 11;
        int max = -1;
        for (int i = 1; i <= 1000; i++) {
            int randomNumber = (int)(1 + Math.random() * 11);
            total += randomNumber;
            if (randomNumber < min) {
                min = randomNumber;
            } else {
                max = randomNumber;
            }
        }
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Average: " + (total / 1000d));
        /* Results:
        Math.pow(3.0, 2.0) = 9.0
        Math.sqrt(25.0) = 5.0
        Math.max(6, 2) = 6
        Math.max(-50.0, 7.0) = 7.0
        Math.random() = 0.8880025942377003
        Min value: 1
        Max value: 1
        Average: 5.953
        */
    }
}
