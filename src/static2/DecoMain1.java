package static2;

public class DecoMain1 {
    public static void main(String[] args) {

        String s = "hello";
        DecoUtil1 util1 = new DecoUtil1();
        String str =  util1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + str);

    }
}
