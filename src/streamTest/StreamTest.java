package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        
        // stream 을 이용한 배열 출력 방식
        int[] arr = {1,2,3,4,5};

        int cum = Arrays.stream(arr).sum();

        System.out.println(cum);
    }
}
