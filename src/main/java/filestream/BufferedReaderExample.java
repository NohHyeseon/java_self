package filestream;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) {

        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("이름을 입력하세요");
            String name = br.readLine();

            System.out.println("나이를 입력하세요");
            int age = Integer.parseInt(br.readLine());

            System.out.println("이름 : "+ name);
            System.out.println("나이 :"+ age);
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("유효한 숫자를 입력하세요");
        }finally {
            try{
                if (br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
