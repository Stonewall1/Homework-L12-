package matrixAdditionTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingMatrixes {
    public static void write(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src//matrixAdditionTask//MatrixAdditionResult.txt"))) {
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    writer.write(matrix1[i][j] + "\t");
                }

                if (i == resultMatrix.length / 2) {
                    writer.write("+\t");
                } else writer.write("\t");

                for (int j = 0; j < matrix2[0].length; j++) {
                    writer.write(matrix2[i][j] + "\t");
                }

                if (i == resultMatrix.length / 2) {
                    writer.write("=\t");
                } else writer.write("\t");

                for (int j = 0; j < resultMatrix[0].length; j++) {
                    writer.write(resultMatrix[i][j] + "\t");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
