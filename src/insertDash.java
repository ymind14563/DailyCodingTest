public class insertDash {
    public String insertDash(String str) {
        // TODO:
        if (str.length() == 0) return null;

        String result = "" + str.charAt(0); //String에 char만 넣으면 변환이 안돼서 오류남. //""// 있어야 됨.

        for (int i = 1; i < str.length(); i++) {
            int firstnum = Character.getNumericValue(str.charAt(i - 1)) % 2; // char -> int로 변환 Character.getNumericValue
            int nextnum = Character.getNumericValue(str.charAt(i)) % 2;
            if (firstnum != 0 && nextnum != 0) {
                result = result + "-";
            }
            result = result + str.charAt(i); //이미 초기화할때 //""// 들어있기에 char만 넣어도 오류 나지 않음.
        }
        return result;

    }

    public static void main(String[] args) {

        insertDash insertDash = new insertDash();
        String output = insertDash.insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }

}

