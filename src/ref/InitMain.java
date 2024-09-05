package ref;

public class InitMain {

    public static void main(String[] args) {
        InitData value = new InitData();

        System.out.println(value.value1); // int 값은 0으로 초기화
        System.out.println(value.value2); // 값을 지정해주면 그걸로 초기화
        System.out.println(value.value3); // boolean 값은 false 로 초기화
        System.out.println(value.value4); // 참조형(배열,메서드) 는 null로 자동 초기화

    }


}
