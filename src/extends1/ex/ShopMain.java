package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {

        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("꽃갈피", 15000, "볼빨간 사춘기");
        Movie movie = new Movie("베테랑2", 18000, "김감독", "황정민, 정해인");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice()  + movie.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
