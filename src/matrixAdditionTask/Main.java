package matrixAdditionTask;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = WorkingWithMatrix.randomMatrixCreation();

        int[][] matrix2 = WorkingWithMatrix.randomMatrixCreation();

        int[][] resultMatrix = WorkingWithMatrix.resultOfSumMatrix(matrix1 , matrix2);

        WritingMatrixes.write(matrix1 , matrix2 , resultMatrix);

    }
}
