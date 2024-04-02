package 프로그래밍문제3;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member tMember = new Member("홍길동", "qwer", "1234", 27);
		System.out.printf("%s\t%s\t%s\t%d\n",tMember.getName(), tMember.getId(), tMember.getPassword(), tMember.getage());
		
		tMember.setMember("아무개", "asdf", "4567", 34);
		System.out.printf("%s\t%s\t%s\t%d\n",tMember.getName(), tMember.getId(), tMember.getPassword(), tMember.getage());

	}

}
