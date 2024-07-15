package multiflefile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//apache poi 라이브러리 사용하여 엑셀 파일 생성 가능
public class TextToExcelConveter {
    public static void main(String[] args) {
        String textFile = "input.txt"; // 텍스트 파일 이름
        String excelFile = "output.xlsx"; // 생성할 엑셀 이름

        List<List<String>> data = readTextFile(textFile); //readTextFile 메소드 만들어주기

        if (data != null) {
            writeToExcel(excelFile, data);
            System.out.println("텍스트 파일을 엑셀 파일로 변환 완료.");
        } else {
            System.out.println("텍스트 파일을 읽는 중 오류가 발생하였습니다.");
        }
    }

    // 텍스트 파일에서 데이터 읽기
    private static List<List<String>> readTextFile(String textFile) {
        List<List<String>> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line; //한줄씩
            while ((line = reader.readLine()) != null) { //readLine() 한줄씩 읽기
                String[] parts = line.split("\t"); // 예시:A\tB\tC 일 경우 탭을 기준으로 split
                List<String> rowData = new ArrayList<>();
                for (String part : parts) {
                    rowData.add(part.trim()); // trim 데이터 앞뒤 공백 제거
                }
                data.add(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return data;
    }

    // 데이터를 엑셀 파일로 쓰기
    private static void writeToExcel(String excelFile, List<List<String>> data) {
        try (Workbook workbook = new XSSFWorkbook()) { //
            Sheet sheet = workbook.createSheet("Sheet1");

            int rowNum = 0;
            for (List<String> rowData : data) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (String cellData : rowData) {
                    Cell cell = row.createCell(colNum++);
                    cell.setCellValue(cellData);
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(excelFile)) {
                workbook.write(outputStream); //write 생성
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
