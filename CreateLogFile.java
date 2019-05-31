import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class CreateLogFile {

    Formatter output;

    public void openFile() {
        try 
        {
            output = new Formatter("Log.txt");
        }
        catch ( SecurityException securityException )
        {
            System.err.println(
                    "You do not have write access to this file." );
            System.exit( 1 ); // terminate the program
        } // end catch
        catch ( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Error opening or creating file." );
            System.exit( 1 ); // terminate the program
        } // end catch
    }

    public void addRecords(String txt)
    {
        try // output values to file
        {   
            output.format("%s\n", txt);
        } // end try
        catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error writing to file.");
            System.exit(1);
        } // end catch
        catch (NoSuchElementException elementException) {
            System.err.println("Invalid input. Please try again.");
        } // end catch
    }

    // close file
    public void closeFile()
    {
        if ( output != null )
            output.close();
    } // end method closeFile
}