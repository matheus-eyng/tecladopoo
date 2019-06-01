import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CreateSequentialFile {

    private String text;
    private ObjectOutputStream output;
    private ArrayList<String> log;
    ReadSequentialFile reader = new ReadSequentialFile();
    File file;
    
    public CreateSequentialFile (String txt) {
        text = txt;
    }

    public void openFile() {
        try
        {
            file = new File("log.ser");

            // Checagem se o arquivo ja existe, caso sim, salva o conteudo.
            if (file.exists()) {
                reader.openFile();
                log = reader.readRecords();
                reader.closeFile();
            }

            output = new ObjectOutputStream(new FileOutputStream("log.ser"));
        }
        catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
    }

    public void addRecords() {
        try {
            for (int i = 0; i < log.size(); i++) {
                output.writeObject(log.get(i));
            }
            output.writeObject(text);
        }

        catch (IOException ioException) {
            System.err.println("Error writing to file.");
        }

        catch (NoSuchElementException elementException) {
            System.err.println("Invalid input.");
            System.exit( 1 );
        }
    }

    // close file
    public void closeFile() {
        try 
        {
            if ( output != null ) {
            output.close();
            } // end method closeFile
        }   

        catch (IOException ioException) {
            System.err.println("Error trying to close file!");
            System.exit(1);
        }
    }

    public String[] getLog() {
        String[] arrayLog = new String[log.size()];

        for (int i = 0; i < arrayLog.length; i++) {
            arrayLog[i] = log.get(i);
        }

        return arrayLog;
    }
}   
