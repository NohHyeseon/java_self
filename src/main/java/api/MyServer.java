package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        BufferedReader in = null; //읽기
        PrintWriter out = null; //쓰기

        ServerSocket serverSocket = null; //서버소켓: 클라이언트로부터의 연결 요청을 '수신'하는 역할
        Socket socket = null;//통신하는 역할
        Scanner scanner = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(4000);//서버소켓 생성 포트 3000에서 클라이언트 연결 요청 기다리기

            System.out.println("[Server실행] Client연결대기중...");
            socket = serverSocket.accept();//클라이언트의 연결 요청을 수락 / 요청 전까지 블로킹 상태대기

            System.out.println("Client 연결됨.");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//클라이언트로부터 데이터를 읽을 준비
            out = new PrintWriter(socket.getOutputStream());//서버에서 클라이언트에게 데이터 보내기위한 출력스트림 정하기

            while (true) {
                String inputMessage = in.readLine();    // 수신데이터 한줄씩 읽기,개행문자 or 리턴을 만나기 전까지 보든 문자를 읽어들여 문자로반환
                if ("quit".equalsIgnoreCase(inputMessage)) {//만약 "quit"이라는 단어가 있다면
                    socket.close();//socket을 닫고
                    System.out.println("[Server실행] Client연결대기중...");//다시 처음부터 server실행 새로운 client받을 준비
                    socket = serverSocket.accept();//클라이언트의 요청 전까지 대기
                    System.out.println("Client 연결됨.");
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    out = new PrintWriter(socket.getOutputStream());
                } else { //'quit'이 아닌 다른 메세지를 받을 경우

                    System.out.println("From Client: " + inputMessage);//클라이언트로부터 받은 메세지 출력
                    System.out.print("전송하기>>> ");//서버사용자가 보낼메세지 입력할 수 있도록 프롬프트 출력

                    String outputMessage = scanner.nextLine();//보낼 메세지 읽기
                    out.println(outputMessage);//println출력 스트림 작성하고 자동으로 줄 바꿈 문자 추가
                    out.flush();//출력 스트림 강제로 비워 버퍼에 남아있는 모든 데이터 전송
                    if ("quit".equalsIgnoreCase(outputMessage)) break;//만약 quit을 입력하면 break를 통해 while루프 종료
                }
            }
        } catch (IOException e) {//while루프 종료후 finally, try-catch이동
            e.printStackTrace();
        } finally {
            try {
                scanner.close();        // Scanner 닫기
                socket.close();            // Socket 닫기
                serverSocket.close();        // ServerSocket 닫기
                System.out.println("연결종료");
            } catch (IOException e) {
                System.out.println("소켓통신에러");
            }
        }
    }

}

