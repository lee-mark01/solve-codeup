/*
 1. throws 로 하는 경우
 main 메서드 안에서 IOException이 발생할 수 있음을 선언만 한 것.
 IOException이란
 파일 읽기 쓰기 권한이 없거나, 파일이 없거나, 콘솔 입력, 네트워크 통신, 스트림 사용할 때 문제가 생기면 발생.

 이 메서드를 호출한 쪽에서 처리하라고 책임을 위임
 IOException이 발생하면, JVM으로 예외 전달하고, 즉시 프로그램이 종료된다
 테스트 코드 작성할 때 쓰인다.
*/

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        pw.println("Hello");
        br.close();
        pw.close();
    }
}

/*
2. try catch 로 하는 경우
예외가 발생할 수 있는 코드를  try에 넣고, 실제 예외가 발생하면 catch 에서 처리
프로그램 비정상 종료 되지 않고 계속 실행가능.
서버에서 이렇게 코딩함.
실제 서비스에서도 이렇게 코딩
 */

/*
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
			pw.println("Hello");
			br.close();
			pw.close();

		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

*/