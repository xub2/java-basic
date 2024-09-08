package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        //멤버변수와 파라미터가 다를 때
        nameField = nameParameter; // this 키워드가 없어도 스코프가 가까운 순서대로 탐색  , 즉 this 가 생략이 되어 있다.
    }
}
