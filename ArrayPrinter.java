public class ArrayPrinter {
    public static void main(String[] args) {
        int[] oneD = {5, 6, 7, 8};
        printArray(oneD);
        System.out.println("");
        int[][] twoD = {{2, 4, 6, 8}, {8, 7, 9, 1}, {3, 5, 1, 2}};
        printArray(twoD);
        System.out.println("");
        int[][] twoD2 = {{1, 2}, {3, 4, 5}, {6}, {7, 8, 9}};
        printArray(twoD2);
    }

    public static void printArray(int[] arr) {
        // displap opening sqaure bracket character
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (i != (arr.length - 1)) { // check if the iteration number is not the total number of items in the array
                System.out.print(val + ", ");
            } else {
                System.out.print(val);
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(int[][] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  ");
            printArray(arr[i]);
        }
        System.out.println("]");
    }    
}
/* Results:
[5, 6, 7, 8] 

[
  [2, 4, 6, 8] 
  [8, 7, 9, 1] 
  [3, 5, 1, 2] 
]

[
  [1, 2] 
  [3, 4, 5] 
  [6] 
  [7, 8, 9] 
]
*/
