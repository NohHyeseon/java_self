package filestream;

import java.io.*;


    public class FileputStreamExample {
        public static void main(String[] args) {
            // 파일 경로 수정
            File file = new File("C:\\Intel\\Profiles\\output.txt");
            FileInputStream fis = null;
            FileOutputStream fos = null;
            InputStreamReader isr = null;

            try {
                // 파일 생성
                fos = new FileOutputStream(file);

                // 출력할 데이터 설정
                String str = "젤리는 귀엽다."; // 한글 데이터
                byte[] b = str.getBytes("UTF-8");

                // 파일에 정보 생성
                fos.write(b);
                fos.flush(); // 버퍼 비우기

                // 바이트 입력 스트림 생성
                fis = new FileInputStream(file);
                isr = new InputStreamReader(fis, "UTF-8"); // 인코딩 설정

                StringBuilder sb = new StringBuilder();
                char[] cbuf = new char[5]; // 5글자씩 읽기 위해서
                int readCnt;

                // 읽어오기
                while ((readCnt = isr.read(cbuf)) != -1) {
                    sb.append(cbuf, 0, readCnt);
                }

                // 결과 출력
                System.out.println("파일 내용: " + sb.toString());

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (isr != null) isr.close();
                    if (fis != null) fis.close();
                    if (fos != null) fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
