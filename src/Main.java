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

//        reverseArr reverseArr = new reverseArr();
//        int[] output = reverseArr.reverseArr(new int[]{1, 2, 3, 4, 5, 6, 7});
//        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]

//        readVertically readVertically = new readVertically();
//
//        String[] input = new String[]{readVertically.readVertically(new String[]{"hi", "wolrd",})} 87;
//        String output = readVertically.readVertically(input);
//        System.out.println(output); // --> "hwiolrd"

//        superIncreasing superIncreasing = new superIncreasing();
//        boolean output = superIncreasing.superIncreasing(new int[]{1, 3, 6, 13, 58});
//        System.out.println(output); // --> true

//        modulo modulo = new modulo();
//        Integer output = modulo.modulo(25, 4);
//        System.out.println(output); // --> 1

//        isIsogram isIsogram = new isIsogram();
//        boolean output = isIsogram.isIsogram("abb");
//        System.out.println(output); // false

        computeSquareRoot computeSquareRoot =  new computeSquareRoot();
        String output = computeSquareRoot.computeSquareRoot(9);
        System.out.println(output); // --> "3.00"
    }
}