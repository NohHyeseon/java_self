package filestream;

import java.io.*;
import java.nio.Buffer;

public class StreaReaderExample {
    public static void main(String[] args) {
        File file = new File("C:\\Intel\\Profiles\\jelly.txt");
        BufferedOutputStream bos = null;//output값초기화 시키기
        BufferedInputStream bis = null;//input값 초기화 시키기

        try {
            bos = new BufferedOutputStream(new FileOutputStream(file));
            String str = "안녕 나는 노젤리야";

            byte[] bytes = str.getBytes("UTF-8");//byte배열로 변환

            bos.write(bytes);//bytes배열에 있는 데이터를 파일에 쓰기
            bos.flush();// 버퍼에 남아 있는 모든 데이터 파일에 쓰기

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bis = new BufferedInputStream(new FileInputStream(file));//output.txt파일에서 데이터 읽을 수 있는 input객체생성
            byte[] buffer = new byte[1024];//1KB 크기 바이트 배열 생성
            int byteRead = 0;//bis.read메서드에 읽어온 바이트 수를 저장할 변수 선언
            StringBuilder sb = new StringBuilder();//데이터를 모아 문자열로 저장하는 역할

            while((byteRead = bis.read(buffer))!= -1){
                sb.append(new String(buffer,0,byteRead));
            }
            System.out.println("파일내용: " + sb.toString());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bis !=null)bis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
