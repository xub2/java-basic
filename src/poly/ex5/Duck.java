package poly.ex5;

public class Duck implements InterFaceAnimal {


    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리 이동");

    }
}
