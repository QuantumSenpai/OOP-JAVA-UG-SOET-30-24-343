class Matrix {
    int[][] mat;

    Matrix(int[][] mat) {
        this.mat = mat;
    }

    void displayProperties() {
        System.out.println("Rows: " + mat.length);
        System.out.println("Columns: " + mat[0].length);
    }
}

class SquareMatrix extends Matrix {

    SquareMatrix(int[][] mat) {
        super(mat);
    }

    void displayProperties() {
        super.displayProperties();

        int trace = 0;
        for (int i = 0; i < mat.length; i++) {
            trace += mat[i][i];
        }
        System.out.println("Trace: " + trace);
    }

    void checkIdentity() {
        boolean isIdentity = true;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j && mat[i][j] != 1)
                    isIdentity = false;
                else if (i != j && mat[i][j] != 0)
                    isIdentity = false;
            }
        }

        if (isIdentity)
            System.out.println("It is an Identity Matrix");
        else
            System.out.println("It is NOT an Identity Matrix");
    }
}

class Main {
    public static void main(String[] args) {

        int[][] sq = {
            {1, 0},
            {0, 1}
        };

        SquareMatrix sm = new SquareMatrix(sq);
        sm.displayProperties();
        sm.checkIdentity();
    }
}

/*
Output:
Rows: 2
Columns: 2
Trace: 2
It is an Identity Matrix
*/
