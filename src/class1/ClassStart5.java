package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); // new Student() 를 통해 객체의 참조값을 student1 에 저장
        student1.name = "임요섭1";
        student1.age = 25;
        student1.score = 100;

        Student student2 = new Student();// new Student() 를 통해 객체의 참조값을 student2 에 저장
        student2.name = "섭요임2";
        student2.age = 52;
        student2.score = 1;

        Student student3 = new Student();
        student3.name = "요임섭3";
        student3.age = 241;
        student3.score = 231;

        Student[] students = new Student[] {student1, student2, student3};

        for (int i = 0 ; i < students.length ; i++) {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].score);
        }

        for (Student student : students) {
            System.out.println(student.name + student.age + student.score);

        }
    }
}
