import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadSequentialFile {

    private ObjectInputStream input;

    public void openFile() {
        try {
            input = new ObjectInputStream(new FileInputStream("log.ser"));
        }

        catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
    }

    public ArrayList<String> readRecords() {

        ArrayList<String> log = new ArrayList<String>();
        String logText;

        try {
            while (true) { // Adiciona cada linha do log.ser como String em um ArrayList
                logText = (String) input.readObject();
                log.add(logText);
            }
        }

        catch (EOFException endOEofException) {
           return log;
        }

        catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Unable to create object.");
        }

        catch (IOException ioException) {
            System.err.println("Error during reading from file");
        }

        return log; // Retorna o ArrayList para usar em outra classe
    }

    public void closeFile() {
        try {
            if (input != null) {
                input.close();
            }
            System.exit(0);
        }

        catch (IOException ioException) {
            System.err.println("Error closing file.");
            System.exit(1);
        }
    }
}