package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerWithThread {
    private static final int PORT = 3000; //포트설정
    private static List<ClientHandler> clients = new ArrayList<>();//여러 client받기


    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("[Server실행] Client 연결 대기중...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client 연결됨:" + socket);
                ClientHandler clientHandler = new ClientHandler(socket);
                clients.add(clientHandler);
                clientHandler.start();//run 실행 부분
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                out = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                while (true) {
                    String receivedMessage = receiveMessage(); // 클라이언트로부터 메시지 수신
                    if (receivedMessage == null) {
                        break; // 연결 종료
                    }
                    System.out.println("클라이언트로부터 받은 메시지: " + receivedMessage);
                    String response = "서버가 받은 메시지: " + receivedMessage;
                    sendMessage(response); // 클라이언트에게 응답 전송
                }
            } catch (IOException e) {
                System.out.println("클라이언트 연결 대기.");
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                        System.out.println("연결 종료");
                        clients.remove(this); // 클라이언트 제거
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        private String receiveMessage() throws IOException {
            return in.readLine(); // 클라이언트로부터 메시지 수신
        }

        private void sendMessage(String message) {
            out.println(message); // 클라이언트에게 메시지 전송
        }
    }
}


