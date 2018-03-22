import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Input matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter matrix[" + i + "," + j + "]:");
                matrix[i][j] = input.nextInt();
            }
        }
        //display
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Total main diagonal:
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    total += matrix[i][j];
                }
            }
        }
        System.out.println("Total main diagonal: " + total);
    }
}
