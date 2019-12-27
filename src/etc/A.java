package etc;

public class A {
   public static void test () {
        byte a = 127; // -128 ~ 127
        short b = 10000; // 2 byte
        long c = 3000000000L;
        double d = 0.34;
        float e = 1.2f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
