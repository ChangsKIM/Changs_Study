package e03_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriteMain {

	public static void main(String[] args) {
		//1. 노드스트림, 프로세스 스트림 생성 및 초기화
		// true -> 추가 모드(기존 파일 삭제 X 이어서 쓰기)
		// false -> 새파일(기존 파일 삭제 O)
		try(FileWriter fw = new FileWriter("c:\\test\\write.txt",true);
			PrintWriter pw = new PrintWriter(fw);){
			
			//2. 텍스트 출력
			pw.println("안녕하세요");
			pw.println("234234324");
			pw.println("Hello World");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}






