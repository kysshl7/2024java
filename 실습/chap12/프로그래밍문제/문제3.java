package 프로그래밍문제;

import java.io.*;

public class 문제3 {
    public static void main(String[] args) {
        double[] num = {0,0,0,0,0};

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Temp\\double.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Temp\\double.txt"));){

            for(double x : num)
                dos.writeDouble(x);

            dos.flush();

            for(int i=0;i<5;i++)
                System.out.println(dis.readDouble());


        } catch (IOException e) { }
    }
}

