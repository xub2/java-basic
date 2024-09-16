package final1;

public class FinalLocalMain {

    public static void main(String[] args) {

        //final 지역 변수 1
        final int data1;
        data1 = 10; //최조 1회만 값 할당 가능

        //data1 = 20; //이거 안됨 진짜 뒤진다

        final int data2 = 10;
    }

    static void method(final int parameter) {
        //parameter = 10;
    }
}
