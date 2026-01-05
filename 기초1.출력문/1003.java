/*
줄바꿈해서 출력하기.
이거 pw.print() 하면 줄 안바뀌고 출력됨.
 */

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        pw.println("Hello");
        pw.println("World");
        br.close();
        pw.close();
    }
}