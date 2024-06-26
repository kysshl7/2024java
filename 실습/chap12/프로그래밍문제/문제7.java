package 프로그래밍문제;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class CountLetter {
    char lookFor;
    String fileName;
    int count =0;

    public CountLetter (char lookFor,String fileName) {
        this.lookFor = lookFor;
        this.fileName = fileName;
    }

    public int count() {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);
            char[] buf = new char[10000];
            int bufLen = 0;
            while (true) {
                int c = br.read();
                if (c == -1) break;
                buf[bufLen++] = (char) c;
            }
            for (int i = 0; i < bufLen; i++) {
                if (buf[i] == lookFor) {
                    count++;
                }
            }
            reader.close();
            br.close();
        } catch (IOException e) {
        }
        return count;
    }
}

public class 문제7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = in.nextLine();
        System.out.print("세고자 하는 문자를 입력하세요 : ");
        char lookFor = in.nextLine().charAt(0);

        int count = new CountLetter(lookFor, fileName).count();
        System.out.format("%s 파일에 %c 문자가 %d개 %n", fileName, lookFor, count);
    }
}

