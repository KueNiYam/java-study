package classOverride;

/**
 * 오버라이드의 확장
 *  - 반환 값과 형(클래스)이 다른 메소드도 오버라이딩 할 수 있다.
 *  - 단, 반환 값의 형은 상속한 메소드의 반환 값의 형의 서브 클래스라야 한다.
 */
public class SubX extends SuperZ {
    /**
     * @return Double 은 Number 의 서브 클래스이므로 오버라이딩이 가능하다.
     */
    Double num() {
        return 10d;
    }
}
