package etc;

/**
 * break label 에 관한 예제
 */
public class B {
    public static void test() {
        int a = 0;
        label:
        while (true) {
            System.out.println(a);
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (a == 3 && i == 3) {
                    break label;
                }
            }
            a++;
        }
    }
}
