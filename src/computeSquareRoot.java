public class computeSquareRoot {
    public static String computeSquareRoot(int num) {
        // TODO:
        //바빌로니아 공식 (제곱근 구하는 공식)
        double result = num;  // 범위를 크게 벗어나지 않으면 어떤 수(num)도 상관없음.
        for (int i = 0 ; i < num ; i++) {
            result = 0.5 * (num / result + result);
        }

        return String.format("%.2f", result);
    }
}
