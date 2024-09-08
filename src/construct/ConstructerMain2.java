package construct;

public class ConstructerMain2 {
    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("요섭", 25, 90 ); // 객체를 생성함과 동시에 생성자를 통해 멤버변수 초기화
        MemberConstruct member2 = new MemberConstruct("경민" , 27);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members){
            System.out.println("이름 : " + member.name + ", 나이 : " + member.age + ", 성적: " + member.grade);
        }


    }
}
