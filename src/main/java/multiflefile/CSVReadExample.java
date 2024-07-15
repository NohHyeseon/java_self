package multiflefile;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CSVReadExample {
    public static void main(String[] args) {
        // 올바른 파일 경로로 수정
        File file = new File("D:\\intellij\\java\\java\\example.csv");

        try (FileReader fr = new FileReader(file)) {
            int character;
            StringBuilder sb = new StringBuilder();

            while ((character = fr.read()) != -1) {
                sb.append((char) character);
            }
            System.out.println("contents: " + sb);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
