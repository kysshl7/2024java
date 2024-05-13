package 프로그래밍문제3;

public class BookPriceTest {
    public static void main(String[] args) {
        Book[] books = { new Book(15000), new Book(50000), new Book(20000)};

        System.out.println("정렬 전");
        for (Book i : books) {
            i.BookPrice();
        }
        Arrays.sort(books);
        System.out.println("정렬 후");
        for (Book i : books) {
            i.BookPrice();
        }
    }
}