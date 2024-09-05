package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); // new Student() 를 통해 객체의 참조값을 student1 에 저장
        student1.name = "요섭";
        student1.age = 25;
        student1.score = 100;

        Student student2 = new Student();// new Student() 를 통해 객체의 참조값을 student2 에 저장
        student2.name = "섭요임";
        student2.age = 52;
        student2.score = 1;

        Student[] students = new Student[2];
        students[0] = student1; // 그러므로 여기서는 참조값이 복사되어 0번째 인덱스에 저장이 된다.
        students[1] = student2; // 마찬가지로 여기서도 참조값이 1번째 인덱스에 저장됨.



        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[0].name + " " + students[0].age + " " + students[0].score);
        System.out.println(students[1].name + " " + students[1].age + " " + students[1].score);

    }
}
