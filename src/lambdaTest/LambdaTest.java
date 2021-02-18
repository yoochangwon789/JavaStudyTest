package lambdaTest;

interface printString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {

        // 람다식을 변수명으로 활용
        printString lambdaStr = str -> System.out.println(str);
        lambdaStr.showString("람다식을 변수명으로 활용");

        // 매개변수 타입 활용
        showMyString(lambdaStr);

        // 람다식을 반환 값으로 활용
        printString lambdaStr2 = returnString();
        lambdaStr2.showString("람다식을 반환 값으로 활용");
    }

    // 람다식 함수의 매개변수 타입으로 활용
    public static void showMyString(printString p) {
        p.showString("람다식을 매개변수 타입으로 활용");
    }

    // 람다식을 반환 값으로 사용
    public static printString returnString() {
        return str -> System.out.println(str + "!!!");
    }
}
