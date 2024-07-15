package multiflefile;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class CSVWriterExample {
    public static void main(String[] args) {
        String csvFile = "example.csv";

        // CSV 파일에 쓸 데이터 준비
        List<List<String>> data = Arrays.asList(
                Arrays.asList("노젤리", "7", "Türkiye"),
                Arrays.asList("문시니", "2", "Russia"),
                Arrays.asList("몽구리", "7", "USA")
        );

        // CSV 파일 작성
        try (Writer writer = new FileWriter(csvFile);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {

            // 헤더 작성
            csvPrinter.printRecord("Name", "Age", "Country");

            // 데이터 작성
            for (List<String> rowData : data) {
                csvPrinter.printRecord(rowData);
            }

            System.out.println("CSV file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
