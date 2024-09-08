package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){ //추가한 생성자
        this(name, age , 50);

    }

    MemberConstruct(String name, int age, int grade){ // 생성자 생성
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
