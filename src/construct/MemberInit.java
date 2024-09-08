package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age , int grade){ //이건 메서드임
        this.name = name; //this 키워드는 자기자신의 인스턴스를 가르킨다
        this.age = age;
        this.grade = grade;
    }
}
