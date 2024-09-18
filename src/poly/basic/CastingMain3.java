package poly.basic;

public class CastingMain3 {
    //upcasting vs downcasting

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 업캐스팅은 형변환 생략 가능, 생략 권장
        Parent parent2 = (Parent) child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
