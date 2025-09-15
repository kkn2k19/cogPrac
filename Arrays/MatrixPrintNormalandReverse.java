import java.util.Scanner;

public class MatrixPrintNormalandReverse {
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

        System.out.println("Normal Order Print (Matrix) : ");
        printNormal(matrix);
        System.out.println("Reverse Order Print (Matrix) : ");
        printReverse(matrix);
    }

    public static void printNormal(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printReverse(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\Arrays\" && javac
// MatrixPrintNormalandReverse.java && java MatrixPrintNormalandReverse && del
// MatrixPrintNormalandReverse.class
// 3 3
// 1 2 3 4 5 6 7 8 9
// Normal Order Print (Matrix) :
// 1 2 3
// 4 5 6
// 7 8 9
// Reverse Order Print (Matrix) :
// 9 8 7
// 6 5 4
// 3 2 1