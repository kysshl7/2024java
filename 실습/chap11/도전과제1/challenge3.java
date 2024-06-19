package 도전과제1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class challenge3 {
public static void main(String[] args) {
// TODO Auto-generated method stub 
Map<String, String> dic = new HashMap<>(); 
dic.put("head", "대가빠리");
dic.put("teacher", "쌤");
dic.put("cat", "꼬네이");
dic.put("aunt", "아지매");
dic.put("noodle", "국시");
dic.put("child", "얼라");
dic.forEach((k, n) -> System.out.print(k + "=" +n+" "));
System.out.println();
Collection<String> collection1 = dic.values();
List<String> list = new ArrayList<>(collection1);
Collections.shuffle(list);
list.forEach(x -> System.out.print(x + " "));
	
	}
}