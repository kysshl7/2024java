package 프로그래밍문제;

import java.io.IOException;
import java.io.OutputStream;

public class 문제5 {
    public static void main(String[] args) throws IOException {
        OutputStream out=System.out;

        int num_ascii = 48;
        int alpha_ascii = 65;

        while (num_ascii<='9') {
            out.write(num_ascii++);
            System.out.print(" ");
        }

        System.out.println();

        while (alpha_ascii<='Z') {
            out.write(alpha_ascii++);
            System.out.print(" ");
        }

        out.flush();
    }
}

