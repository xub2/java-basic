package class1;

//기존 코드 리펙토링 하기

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] reviews = new MovieReview[2];

        reviews[0] = inception;
        reviews[1] = aboutTime;

        /* for (int i = 0 ; i < review.length ; i++){
            System.out.println("영화 제목 : " + reviews[i].title +" , 리뷰 : " + reviews[i].review);
        } */

        for(MovieReview review : reviews){
            System.out.println("영화 제목 : " + review.title +" , 리뷰 : " + review.review);
        }
    }
}
