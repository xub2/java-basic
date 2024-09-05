package ref;

public class Method2 {

    public static void main(String[] args) {

        Student student1 = createStudent("요섭", 25 , 100);
        Student student2 = createStudent("섭요", 52 , 200);

        printStudent(student1);
        printStudent(student2);


    }

    static Student createStudent(String name ,int age, int grade){
        Student student = new Student(); // 참조값 생성
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 참조 값 반환
    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
