package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
     클라이언트 프로그램
      ip는 127.0.0.1, 포트번호 3333 서버 접속
      사용자로 부터 숫자를 하나 받음
      받은 숫자를 문자열로 변환해서 서버로 보냄
      서버에서 보낸 결과값을 출력
 */
public class ClientMain {

	public static void main(String[] args) {
		try (Socket server = new Socket("127.0.0.1",3333);
				Scanner sc = new Scanner(System.in)) {
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
			
			System.out.print("서버로 보낼 숫자 입력 : ");
			int n = sc.nextInt();
			
			pw.println(String.valueOf(n));
			pw.flush();
			
			String msg = br.readLine();
			System.out.println("서버에서 보내준 결과 : " + msg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


