package step02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServerMain {

	public static void main(String[] args) {
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(2222)) {
			System.out.println("서버 오픈 - 포트번호 2222");
			while(true) {
				// 2. 클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "에서 접속함....");
				// 3. 클라이언트를 담당할 스레드 생성 후 실행
				ServerWorker worker = new ServerWorker(client);
				worker.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
