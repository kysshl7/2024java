package 프로그래밍문제;

import java.io.File;

public class 문제1 {
	public static void main(String[] args) {
        File file = new File("D:\\Temp\file.txt");

        if(file.exists())
            System.out.println("파일이 존재합니다.");
        else
            System.out.println("파일이 존재하지 않습니다.");
    }


}
