import java.util.Scanner;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("square root(floor) : " + squareRoot(n));
    }

    public static int squareRoot(int n) {
        int start = 0;
        int end = n;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;
            if (sq == n)
                return mid;
            if (sq < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}

// 64
// square root(floor) : 8

// 69
// square root(floor) : 8