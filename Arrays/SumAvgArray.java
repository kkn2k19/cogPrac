import java.util.Scanner;

public class SumAvgArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        double avg = (double) sum / n;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}

// 5
// 1 5 4 3 2
// sum : 15
// avg : 3.0