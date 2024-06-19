package 도전과제1;

import java.util.ArrayList;
import java.util.List;

public class challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> capitals = new ArrayList<>();
		capitals.add("서울");
		capitals.add("워싱턴");
		capitals.add("베이징");
		capitals.add("파리");
		capitals.add("마드리드");
		for(String c:capitals)
			System.out.print(c+" ");
		System.out.println();
		capitals.add("런던");
		Iterator<String> iterator = capitals.iterator();
		while (iterator.hasNext()+" ")
			System.out.print(iterator.next()+" ");
		System.out.println();
		capitals.removeIf(c->c.length()>=3);
		capitals.forEach(c->System.out.print(c+" "));
		

	}

}
