package Assignment8;

public class MatrixMultiply {

    public int[][] multiplyM1M2(int[][] num1, int[][] num2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)  {
                for (int k = 0; k < 3; k++)  {
                    result[i][j] = result[i][j] + num1[i][k] * num2[k][j];
                }
            }
        }
        return result;
    }
}


