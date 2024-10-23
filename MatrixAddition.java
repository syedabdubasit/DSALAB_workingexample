public class MatrixAddition {
    public static void main(String[] args) {
        int[][] A = {
            {3, 2, 1},
            {4, 5, 6},
            {9, 8, 7}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }
}