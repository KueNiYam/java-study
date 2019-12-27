package interfaceDefaultAndStatic;

/**
 * 통상의 오버라이드
 * 
 */
public class Greeting implements Greet1, Greet2, Greet3 {
    @Override
    public void greet() {
        System.out.println("안녕하세요.");
    }
}
