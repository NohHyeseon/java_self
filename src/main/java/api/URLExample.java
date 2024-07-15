package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLExample {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.google.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            // 생성한 url 객체를 사용해 http 연결을 엽
            con.setRequestMethod("GET");//http 요청 메서드를 GET으로 설정

            int responseCode = con.getResponseCode();//서버 응답코드 받기
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader (new InputStreamReader(con.getInputStream()));//읽기
            String inputLine;//서버로 부터 받은 한줄의 문자열 저장
            StringBuilder content = new StringBuilder();

            while((inputLine =in.readLine())!=null){
                content.append(inputLine);//서버 내용을 읽어 builder객체에저장
            }
            in.close();
            con.disconnect(); //입력스트림과 http 연결 닫기

            System.out.println("content: " + content.toString());//url에서 받은 웹페이지

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
