public class power {
    public long power(int base, int exponent) {
        // 금지된 문자열은 주석까지 확인합니다.
        // TODO:
        if(exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1) return (base * result) % 94906249;
        else return result;
    }

    public static void main(String[] args) {
        power power = new power();
        long output = power.power(3, 40);
        System.out.println(output);
    }
}

