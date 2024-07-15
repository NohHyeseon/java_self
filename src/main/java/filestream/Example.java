package filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        String textFile = "ttt.txt";
        List<String> contents = new ArrayList<>();

        String currentDir = System.getProperty("user.dir");

        contents.add("키키키키 안녕");
        contents.add("꺄르르르르 안녕");
        contents.add("꺄르르르르하하하하");
        contents.add("호호호호호");

        String filePath = currentDir + "\\" + textFile;

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(textFile))){
            List<String> file = new ArrayList<>();
            file.add(contents.get(0));
            file.add(contents.get(1));
            file.add(contents.get(2));
            file.add(contents.get(3));
            System.out.println("텍스트 리스트 생성 완료" + file);
        }catch (IOException e){
            e.printStackTrace();
        }
        }

    }
