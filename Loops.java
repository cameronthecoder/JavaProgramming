import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the height of the rectangle: ");
        Integer height = input.nextInt();
        System.out.print("Please enter the width of the rectangle: ");
        Integer width = input.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }

        System.out.print("Please enter the height of the 2nd rectangle: ");
        Integer height2 = input.nextInt();
        System.out.print("Please enter the width of the 2nd rectangle: ");
        Integer width2 = input.nextInt();
        for (int i = 1; i <= height2; i++) {
            if (i == 1 || i == height2) {
                for (int j = 1; j <= width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= width; j++) {
                    if (j == 1) {
                        System.out.print("*");
                    } else if (j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        input.close();
    }
}
