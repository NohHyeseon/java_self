package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        BufferedReader in = null; //BufferedReader로 데이터를 읽어내겠다
        PrintWriter out = null;//PrinWriter를 통해 데이터를 내보겠다

        Socket socket = null;//client측에서 연결 하기 위한 Socket 객체를 선언
        Scanner scanner = new Scanner(System.in);//사용자로 입력받는 scanner

        try {
            socket = new Socket("127.0.0.1", 4000);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//
            out = new PrintWriter(socket.getOutputStream());//서버로 보내기

            while (true) {//반복
                System.out.print("전송하기>>> ");
                String outputMessage = scanner.nextLine();//작성
                out.println(outputMessage);//message내보내기
                out.flush();//모든 데이터 정리해서 보내기
                if ("quit".equalsIgnoreCase(outputMessage)) break;//quit이 되기전까지 반복

                String inputMessage = in.readLine();//서버에서 온 메세지 한줄씩 읽기
                System.out.println("From Server: " + inputMessage);//출력
                if ("quit".equalsIgnoreCase(inputMessage)) break;//서버에서'quit'일경우 반복문 종료
            }
        } catch (IOException e) {//while문 끝나면 차례로 실행
            System.out.println(e.getMessage());
        } finally {
            try {
                scanner.close();
                if (socket != null) socket.close();
                System.out.println("서버연결종료");
            } catch (IOException e) {
                System.out.println("소켓통신에러");
            }
        }
    }

}


