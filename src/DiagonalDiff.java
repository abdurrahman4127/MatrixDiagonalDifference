import java.util.Scanner;

public class DiagonalDiff {
    static int difference(int[][] A, int n) {
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                if (i == j) {
                    d1 += A[i][j];
                }

                if((i+j) == (n-1)) {  // if (i == n - j - 1) works too
                    d2 += A[i][j];
                }
            }
        }

        // System.out.println("d1 : " + d1);
        // System.out.println("d2 : " + d2);

        return Math.abs(d1 - d2);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][]A = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j=0; j<n; j++){
                A[i][j] = scanner.nextInt();
            }
        }

        /*
        int[][]A = {
                      {11, 2, 4},
                      {4 , 5, 6},
                      {10, 8, -12}
                   };

         */

        System.out.print(difference(A, n));
    }
}

