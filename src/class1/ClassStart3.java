package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "요섭";
        student1.age = 25;
        student1.score = 100;

        Student student2 = new Student();
        student2.name = "섭요임";
        student2.age = 52;
        student2.score = 1;

        System.out.println(student1.name);
        System.out.println(student2.name);

    }
}
