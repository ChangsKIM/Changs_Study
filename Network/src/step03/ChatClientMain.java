package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientMain {
 
	private static class Worker extends Thread{
		private Socket server;

		public Worker(Socket server) {
			this.server = server;
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()))){
				while(true) {
					String str = br.readLine();
					if(str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try(Socket server = new Socket("127.0.0.1",3333);
				Scanner sc = new Scanner(System.in)){
			System.out.println("서버에 접속했습니다.");
			
			Worker worker = new Worker(server);
			worker.start();
			
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			while(true) {
				System.out.println("보낼 메세지 작성");
				String str = sc.nextLine();
				pw.println(server.getInetAddress() 
						+" 님이 보낸 메세지 : " + str);
				pw.flush();
				if(str.equals("exit")) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
