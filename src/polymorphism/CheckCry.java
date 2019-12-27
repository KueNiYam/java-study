package polymorphism;

/**
 * instanceof 키워드
 *  - 왼쪽 오브젝트가 오른쪽 클래스의 클래스이거나 서브 클래스라면 true 를 반환한다.
 */
public class CheckCry {
    public static void test() {
        Cat cat = new Cat();
        Dog dog = new Dog();

        if (cat instanceof Cry) {
            cat.cry();
        }
        if (dog instanceof Cry) {
            dog.cry();;
        }
    }
}
