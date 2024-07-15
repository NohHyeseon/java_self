package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        BufferedReader in = null; //server로 부터 받은 메시지 읽기 BufferedReader
        PrintWriter out = null;//서보로 메시지 보내기 writer

        Socket socket = null;//server와 TCP연결 담당하는 Socket
        Scanner scanner = new Scanner(System.in);//사용자로 입력받는 scanner

        try {
            socket = new Socket("127.0.0.1", 5000);

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//읽기
            out = new PrintWriter(socket.getOutputStream());//서버로 보내기

            while (true) {//반복
                System.out.print("전송하기>>> ");
                String outputMessage = scanner.nextLine();//작성
                out.println(outputMessage);
                out.flush();
                if ("quit".equalsIgnoreCase(outputMessage)) break;//quit이 되기전까지 반복

                String inputMessage = in.readLine();
                System.out.println("From Server: " + inputMessage);
                if ("quit".equalsIgnoreCase(inputMessage)) break;
            }
        } catch (IOException e) {
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


