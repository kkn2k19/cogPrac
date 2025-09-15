import java.util.Scanner;

public class DiagonalSumSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n]; // n x n matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            sumPrimaryDiagonal += matrix[i][i];
            sumSecondaryDiagonal += matrix[i][n - 1 - i];
        }

        System.out.println("Primary diagonal sum : " + sumPrimaryDiagonal);
        System.out.println("Secondary diagonal sum : " + sumSecondaryDiagonal);
    }
}

// 3
// 1 2 3 4 5 6 7 8 9
// Primary diagonal sum : 15
// Secondary diagonal sum : 15