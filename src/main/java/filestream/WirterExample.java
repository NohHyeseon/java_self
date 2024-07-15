package filestream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WirterExample {
    public static void main(String[] args) {
        File file = new File("C:\\Intel\\Profiles\\sssput.txt");


        try (FileReader fr = new FileReader(file)) {
            int character;
            StringBuilder sb = new StringBuilder();

            while ((character = fr.read()) != -1) {
                sb.append((char) character);
            }
            String contents = sb.toString();
            System.out.println("contents: " + sb);
            System.out.println(sb);
            if (contents.contains("is data")) {
                throw new IOException("읽은 파일에'is data' 라는 문자가 있습니다");
            }
        } catch (IOException e) {
            System.out.println("An error occured: ");
            e.printStackTrace();
        }
    }
}
