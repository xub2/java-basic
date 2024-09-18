package poly.car1;

public class SonataCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("SonataCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("SonataCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("SonataCar.pressAccelerator");
    }
}
