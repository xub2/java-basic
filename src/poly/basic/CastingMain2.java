package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();

        //근데 변수 타입이 Parent 이기 때문에 Child 메서드를 호출할 수 없다
        //poly.childMethod();


        //이때 필요한게 다운캐스팅 ( 부모타입 -> 자식 타입 )
        Child child = (Child) poly; //poly안에 있는 Child객체의 참조값을 Child 타입 child 변수에 저장(+강제 형변환)
        child.childMethod();

        //일시적 다운캐스팅 -> 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // poly.childMethod() 호출이 형변환보다 우선순위가 높다. 그러므로 앞에 형변환 타입에 괄호를 쳐서 우선순위를 높여주자
    }
}
