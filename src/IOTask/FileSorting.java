package IOTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileSorting {
    public void sort() {
        try (BufferedWriter writerValid = new BufferedWriter(new FileWriter("src//IOTask//ValidDocs.txt"));
             BufferedWriter writerInvalid = new BufferedWriter(new FileWriter("src//IOTask//InvalidDocs.txt"))) {

            List<String> listOfDocuments = Files.readAllLines(Path.of(Input.getInput()));

            for (String doc : listOfDocuments) {
                if (doc.matches("[A-Za-z\\d]+") && doc.length() == 15 &&
                        (doc.startsWith("docnum") || doc.startsWith("contract"))) {
                    writerValid.write(doc + "\n");
                } else if (!(doc.startsWith("docnum") || doc.startsWith("contract"))) {
                    writerInvalid.write(doc + " --- invalid document start name\n");
                } else if (!doc.matches("[A-Za-z\\d]+")) {
                    writerInvalid.write(doc + " --- invalid document, because doc must contain only letters and numbers\n");
                } else if (doc.length() != 15) {
                    writerInvalid.write(doc + " --- invalid document, because doc length must be 15 symbols\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
