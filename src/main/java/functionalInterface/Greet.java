package functionalInterface;

/**
 * 함수형 인터페이스
 *  - @FunctionalInterface 어노테이션 사용
 *  - 추상 메소드가 하나만 있는 인터페이스
 *  - static 메소드와 default 메소드 그리고 Object 클래스 메소드의 오버로드는 카운트 하지
 *    않는다.
 */
@FunctionalInterface
public interface Greet {
    public String greet(String name);
}
