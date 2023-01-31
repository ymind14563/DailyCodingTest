import java.util.Arrays;

public class reverseArr {
    public int[] reverseArr(int[] arr){
        // TODO:
        //빈배열일 경우 새로운 배열 출력 = 재귀종료문
        // head에 첫번째 요소 입력
        // tail에 나머지 입력 reverseArr 재귀로 반복해서 나머지 계속 가져오기
        // head + tail 만큼 result 배열 만들고, 배열요소 복사

        if (arr.length == 0) return new int[]{};

        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));
        int[] result = new int[head.length + tail.length];

        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, 1, tail.length);

        return result;

    }
}
