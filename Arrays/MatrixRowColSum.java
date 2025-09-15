import java.util.Scanner;

public class MatrixRowColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        rowWiseSum(matrix);
        colWiseSum(matrix);
    }

    public static void rowWiseSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            int rSum = 0;
            for (int j = 0; j < c; j++) {
                rSum += matrix[i][j];
            }
            System.out.println("row " + (i + 1) + " sum = " + rSum);
        }
        System.out.println();
    }

    public static void colWiseSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int j = 0; j < c; j++) {
            int cSum = 0;
            for (int i = 0; i < r; i++) {
                cSum += matrix[i][j];
            }
            System.out.println("column " + (j + 1) + " sum = " + cSum);
        }
        System.out.println();
    }
}

// 3 3
// 1 2 3 4 5 6 7 8 9
// row 1 sum = 6
// row 2 sum = 15
// row 3 sum = 24

// column 1 sum = 12
// column 2 sum = 15
// column 3 sum = 18
