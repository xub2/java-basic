package final1;

public class FinalFieldMain {
    public static void main(String[] args) {

        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10); // final 이라 더이상 값 변경 불가
        ConstructInit constructInit2 = new ConstructInit(20); // 그리고 아직 변수가 초기화가 안되어서 내가 입력하는 값이 상수가 됨
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println();

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit(); // 얘는 그냥 생성 즉시 10을 상수로 가짐
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println();

        System.out.println("상수 접근");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
