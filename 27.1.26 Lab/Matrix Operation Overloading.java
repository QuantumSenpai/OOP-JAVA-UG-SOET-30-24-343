class MatrixMath {

    void add(int[][] matrix, int scalar) {
        System.out.println("Result of Scalar Addition:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print((matrix[i][j] + scalar) + " ");
            }
            System.out.println();
        }
    }

    void add(int[][] matrixA, int[][] matrixB) {

        // Dimension check
        if (matrixA.length != matrixB.length ||
            matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices dimensions do not match");
            return;
        }

        System.out.println("Result of Matrix Addition:");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {

        MatrixMath m = new MatrixMath();

        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        int scalar = 5;

        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };

        int[][] matrixB = {
            {5, 6},
            {7, 8}
        };

        m.add(matrix, scalar);

        m.add(matrixA, matrixB);
    }
}

/*
Output:

Result of Scalar Addition:
6 7
8 9

Result of Matrix Addition:
6 8
10 12
*/
