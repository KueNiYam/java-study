package anonymousClass;

/**
 * 내부 클래스와 무명 클래스(또는 익명 클래스) 예제
 */
public class Outer {
    public static void test() {
        class Local implements Greet {
            @Override
            public String greet(String name) {
                return "안녕하세요! " + name + " 씨 ";
            }
        }

        Local g = new Local();

        Greet g2 = new Greet() {
            @Override
            public String greet(String name) {
                return "안녕하세요! " + name + " 씨 ";
            }
        };
    }
}
