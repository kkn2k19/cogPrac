import java.util.Scanner;

public class MatrixTranspose {
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

        int[][] transpose = new int[c][r];

        // Transpose logic
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // print
        System.out.println("Transpose : -- ");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
    }
}
