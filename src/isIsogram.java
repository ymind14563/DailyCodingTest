public class isIsogram {
    public boolean isIsogram(String str) {
        // TODO:
        if (str.length() == 0)  return true;
        str = str.toUpperCase();
        for(int i = 0 ; i < str.length() ; i++) {
            for(int j = i + 1 ; j < str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isIsogram isIsogram = new isIsogram();
        boolean output = isIsogram.isIsogram("abb");
        System.out.println(output); // false
    }
}
