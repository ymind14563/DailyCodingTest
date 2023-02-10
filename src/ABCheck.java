public class ABCheck {
    public boolean ABCheck(String str) {
        // TODO :
        if(str.length() == 0)  {
            return false;
        }

        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') ||
                    (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                // i = 0, i, i + 4 로 조건을 줄 경우,
                // 끝자리가 a 혹은 b 일 경우 i가 범위를 넘어서서 오류가 발생된다.
                // i = 4, i, i - 4 로 조건을 줄 경우,
                // i = 4 이더라도 최소값이 4 - 4 = 0 이므로 오류가 발생하지 않는다.
                return true;
            }
        }

        return false;
    }
}
