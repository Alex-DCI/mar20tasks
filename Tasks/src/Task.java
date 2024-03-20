import java.util.Arrays;
public class Task {
    public static void main(String[] args) {
        Integer[] array = {1, 4, 4, 7, 7, 7, 8};
        System.out.println(Arrays.toString(noDuplicates(array)));
    }
    private static int[] noDuplicates(Integer[] source) {
        int repeats = 0, index = 0;
        for (int i = 1; i < source.length; i++) {
            for (int j = 0; j < i; j++) {
                if (source[j] != null && source[j] == source[i]) {
                    repeats++;
                    source[j] = null;
                    break;
                }
            }
        }
        int[] result = new int[source.length - repeats];
        for (int i = 0; i < source.length; i++) {
            if (source[i] == null) continue;
            result[index++] = source[i];
        }
        return result;
    }
}