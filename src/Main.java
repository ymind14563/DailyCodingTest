
public class Main {
    public static void main(String[] args) {

        convertDoubleSpaceToSingle convertDoubleSpaceToSingle = new convertDoubleSpaceToSingle();

        String output = convertDoubleSpaceToSingle.convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"

    }
}
