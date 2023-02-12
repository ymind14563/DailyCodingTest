public class numberSearch {
  public int numberSearch(String str) {
    // TODO:
    if (str.length() == 0) return 0;
    double num = 0;
    double num2 = 0;
    double count = 0;

    for (int i = 0 ; i < str.length() ; i++) {
      if (Character.isDigit(str.charAt(i)) == true) {
        num = Character.getNumericValue(str.charAt(i));
        num2 = num2 + num;
      }

      if (Character.isDigit(str.charAt(i)) == false && str.charAt(i) != ' ') {
        count++;
      }
    }
    double result = num2/ count;
    // double = int / int 하면 double이 나오지 않음(int로 출력), 연산요소도(둘중하나라도) double이어야 double로 출력됨.


    return (int) Math.round((result*10)/10);
  }

  public static void main(String[] args) {
    numberSearch numberSearch = new numberSearch();
    int output = numberSearch.numberSearch("YlQO uT9");
    System.out.println(output);
  }
}
