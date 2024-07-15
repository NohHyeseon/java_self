package multiflefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCreator {
    public static void main(String[] args) {
        String textFile = "input.txt"; // 생성할 텍스트 파일명
        String content = "Hello, World!\nThis is a text file example."; // 파일 내용

        String currentDir = System.getProperty("user.dir"); // 현재 작업 디렉토리
        System.out.println("Current working directory: " + currentDir); //현재 어디 dirctory에 저장되는지 확인 가능

        String filePath = currentDir + "\\" + textFile; // 파일 전체경로 생성하기 위한 코드

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("텍스트 파일 생성 완료: " + filePath); //filePath는 전체경로
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // content가 단순 String 객체가 아니라 list일 경우
}
