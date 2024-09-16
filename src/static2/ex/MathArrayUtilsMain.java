package static2.ex;
import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {

        int[] values = {1,2,3,4,5};

        //static import 적용
        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));

        System.out.println();

        //static import 미적용
        System.out.println("sum = " + MathArrayUtils.sum(values));
        System.out.println("average = " + MathArrayUtils.average(values));
        System.out.println("min = " + MathArrayUtils.min(values));
        System.out.println("max = " + MathArrayUtils.max(values));
    }
}
