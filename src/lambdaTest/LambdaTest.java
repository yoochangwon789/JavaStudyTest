package lambdaTest;

interface printString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {

        // 람다식을 변수명으로 활용
        printString lambdaStr = str -> System.out.println(str);
        lambdaStr.showString("람다식을 변수명으로 활용");
    }
}
