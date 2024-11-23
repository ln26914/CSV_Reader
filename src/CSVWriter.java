import org.apache.commons.csv.*;
import java.io.FileWriter;
import java.io.IOException
import java.util.List;

/*
Reference: StackOverflow
https://stackoverflow.com/questions/3666007/how-to-serialize-object-to-csv-file
*/

public class CSVWriter {
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static Assignment[] FILE_HEADER = {};

    public static boolean writeAssignment(String filepath, List<Assignment> inputData) {
        if (FILE_HEADER == null || FILE_HEADER.length == 0) {
            return false;
        }
        if (inputData == null || inputData.size() == 0) {
            return false;
        }

        FileWriter filewriter = null;
        CSVPrinter csv_printer = null;

        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);

        try {
            // Activate File Writer
            fileWriter = new FileWriter(filepath);
            csv_printer = new CSVPrinter(filewriter, csvFileFormat);

            // Create CSV Header
            csv_printer.printRecord(FILE_HEADER);

            // Write new assignment list to the CSV File
            for (list<Assignment> inputAssign : inputData) {
                // Print assignment to record
                csv_printer.printRecord(inputAssign);
            }
        } catch (Exception e) {
            System.out.println("An error occurred while writing to CSV File.");
            e.printStackTrace();
        } finally {
            FILE_HEADER = null;
            try {
                fileWriter.flush();
                fileWriter.close();
                csv_printer.close()''
            } catch (IOException e) {
                System.out.println("An error ocurred while flushing/closing the file writing utilities.")
                e.printStackTrace();
            }
        }
        FILE_HEADER = null;
        return true;
    }
}