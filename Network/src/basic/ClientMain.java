package basic;

import java.io.IOException;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {
		//1. 서버 접속
		try (Socket server = new Socket("127.0.0.1", 1234)) {
			//2. 스트림 초기화

			//3. 입출력 처리
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}




