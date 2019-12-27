package interfaceDefaultAndStatic;

/**
 * 디폴트 메소드의 인터페이스
 */
public interface Greet2 {
    default void afternoon() {
        System.out.println("안녕하세요.");
    }
}
