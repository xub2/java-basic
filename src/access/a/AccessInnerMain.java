package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {

        AccessData data = new AccessData();

        //public 호출
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;

        data.innerAccess(); //여기서는 innerAccess의 내부 메서드 호출이기 때문에 private 도 호출 가능
    }
}
