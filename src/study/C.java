package study;

/**
 * 가변 인수에 대한 예제
 */
public class C {
    public static int sum(int ...a) {
        int sum = 0;
        for (int i: a) {
            sum += i;
        }

        return sum;
    }
}
