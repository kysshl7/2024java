package 도전과제1;

import java.util.HashMap; 
import java.util.Map;

public class challenge2 {
public static void main(String[] args) {
// TODO Auto-generated method stub 
Map<String, String> dic = new HashMap<>(); 
dic.put("head", "대가빠리");
dic.put("teacher", "쌤");
dic.put("cat", "꼬네이");
dic.put("aunt", "아지매");
dic.put("noodle", "국시");
dic.put("child", "얼라");
for (String key : dic.keySet())
System.out.printf("%s=%s  ", key, dic.get(key));
	
	}
}

