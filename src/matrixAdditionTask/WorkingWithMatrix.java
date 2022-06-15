package matrixAdditionTask;

import java.util.Random;

public class WorkingWithMatrix {

    public static int[][] randomMatrixCreation() {
        Random r = new Random();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = r.nextInt(10);
            }
        }
        return array;
    }
    public static int[][] resultOfSumMatrix(int[][] matrix1 , int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
