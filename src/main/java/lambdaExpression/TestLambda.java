package lambdaExpression;

public class TestLambda {
    public static void test() {
        CalcPower calcPower = n -> n*n;

        System.out.println(calcPower.calc(11));
    }
}
