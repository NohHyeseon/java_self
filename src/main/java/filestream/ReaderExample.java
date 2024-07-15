package filestream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderExample {
    public static void main(String[] args) {
        File file = new File("C:\\Intel\\Profiles\\zeze.txt");

        try(FileWriter fw = new FileWriter(file)) {
            String data ="iss data";

            fw.write(data);//파일에 데이터 쓰기
            System.out.println("success");

        }catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
