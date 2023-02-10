public class modulo {
    public Integer modulo(int num1, int num2) {

        if (num2 == 0)  return null;
        if (num1 == 0) return 0;
        int result = 0;
        int i = 1;

        while (true) {
            int value = num2 * i;
            result = num1 - value;
            if(result > num2) i++;
            else break;

        }
        return result;
    }
}
