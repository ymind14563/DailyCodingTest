public class convertDoubleSpaceToSingle {
    public String convertDoubleSpaceToSingle(String str) {
        // TODO:
        String[] words = str.split("  ");
        return String.join(" ", words);
    }
}
