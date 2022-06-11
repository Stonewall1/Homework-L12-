package matrixAdditionTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingMatrixes {
    public static void write(int[][] matrix1 , int[][] matrix2 , int[][] resultMatrix){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src//matrixAdditionTask//MatrixAdditionResult.txt"))){
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < (resultMatrix[0].length*3 + 10); j++) {
                    if(j < resultMatrix[0].length){
                        writer.write(matrix1[i][j]+"\t");
                    }
                    else if((j >= 5 && j <= 9) || (j>=15 && j <= 19)){
                        if(i == (resultMatrix.length / 2) && j == 7){
                            writer.write("  +  ");
                        }
                        else if(i == (resultMatrix.length / 2) && j == 17){
                            writer.write("  =  ");
                        }
                        else writer.write("     ");
                    }
                    else if(j> 9 && j <15){
                        writer.write(matrix2[i][j - 10] + "\t");
                    }
                    else if(j > 19){
                        writer.write(resultMatrix[i][j - 20] + "\t");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
