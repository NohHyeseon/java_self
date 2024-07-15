package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientWithThread {
    private static final String SERVER_ADDRESS = "127.0.0.1"; // 서버 주소
    private static final int SERVER_PORT = 5000; // 서버 포트

    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // 서버에 연결
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("[서버 연결됨]");

            // 입력 스트림 설정 (서버로부터의 입력)
            in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            // 출력 스트림 설정 (서버로의 출력)
            out = new PrintWriter(socket.getOutputStream(), true);

            // 서버와 메시지 송수신
            while (true) {
                // 사용자로부터 메시지 입력
                System.out.print("전송할 메시지 입력 (quit으로 종료): ");
                String messageToSend = scanner.nextLine();

                // 서버로 메시지 전송
                out.println(messageToSend);
                if ("quit".equalsIgnoreCase(messageToSend)) {
                    break;
                }

                // 서버에서의 응답 받기
                String serverResponse = in.readLine();
                System.out.println("서버에서 받은 응답: " + serverResponse);
            }
        } catch (IOException e) {
            System.out.println("서버 연결 중 오류 발생: " + e.getMessage());
        } finally {
            try {
                // 자원 정리
                scanner.close();
                if (in != null) in.close();
                if (out != null) out.close();
                if (socket != null) socket.close();
                System.out.println("서버 연결 종료");
            } catch (IOException e) {
                System.out.println("소켓 통신 종료 중 오류 발생: " + e.getMessage());
            }
        }
    }
}
