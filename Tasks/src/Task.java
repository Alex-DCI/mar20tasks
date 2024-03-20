public class Task {
    public static void main(String[] args) {
        String[] result = repeatItem("AnyStringYouWantToClone", 8);
    }
    private static String[] repeatItem (String source, int count) {
        String[] result = new String[count];
        for (int i = 0; i < count; i++) result[i] = source;
        return result;
    }
}