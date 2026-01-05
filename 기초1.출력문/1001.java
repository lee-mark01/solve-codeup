// 1. throws 로 하는 경우
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


// 2. try catch 로 하는 경우

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