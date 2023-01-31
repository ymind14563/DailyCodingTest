import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        convertDoubleSpaceToSingle convertDoubleSpaceToSingle = new convertDoubleSpaceToSingle();
//
//        String output = convertDoubleSpaceToSingle.convertDoubleSpaceToSingle("string  with  double  spaces");
//        System.out.println(output); // --> "string with double spaces"

//        removeExtremes removeExtremes = new removeExtremes();
//
//        String[] output = removeExtremes.removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
//        System.out.println(Arrays.toString(output)); // --> ["where", "the", "word"]
//        //Arrays.toString(output); // --> ["where", "the", "word"]
//
//        //배열을 출력할땐 System.out.println(Arrays.toString(output)); Arrays.toString 없으면 주소값이 출력됨.

        reverseArr reverseArr = new reverseArr();
        int[] output = reverseArr.reverseArr(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]


    }
}