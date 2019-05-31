import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;

public class CreateSequencialFile {
    
    private ObjectOutputStream output;

    public void openFile() {
        try
        {
            output = new ObjectOutputStream(
                new FileOutputStream("log.ser"));
        }
        catch (IOException ioException) {
            System.err.println("Error opening file.");
        }
    }

    public void addRecords(String txt) {
        try {
        output.writeObject(txt);
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
}   
