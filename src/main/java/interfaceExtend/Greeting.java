package interfaceExtend;

public class Greeting implements Bye {
    @Override
    public void bye() {
        System.out.println("안녕히 계세요.");
    }

    @Override
    public void greet() {
        System.out.println("안녕하세요.");
    }
}
