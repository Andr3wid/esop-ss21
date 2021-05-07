package MidtermExam;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Before: ");
        prettyPrintMatrix(matrix1);
        System.out.println("After: ");
        prettyPrintMatrix(mirrorMatrix(matrix1));
        System.out.println();
        prettyPrintMatrix(matrix1);

        int[][] matrix2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        System.out.println("Before: ");
        prettyPrintMatrix(matrix2);
        System.out.println("After: ");
        prettyPrintMatrix(mirrorMatrix(matrix2));
    }

    public static int[][] mirrorMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int rowLength = matrix[0].length;
        for (int row = 1; row < matrix.length; row++) {
            if (matrix[row].length != rowLength) {
                return null;
            }
        }

        int[][] mirroredMatrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            mirroredMatrix[(mirroredMatrix.length - 1) - row] = matrix[row];
        }

        return mirroredMatrix;
    }

    public static void prettyPrintMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.print('\n');
        }
        System.out.println();
    }
}
