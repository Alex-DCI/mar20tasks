public class Task {
    public static void main(String[] args) {
        String source = "something";
        for (int i = 0; i < source.length(); i += 2) {
            source = source.substring(0, i) + Character.toUpperCase(source.charAt(i)) + source.substring(i + 1);
        }
        System.out.println(source);
    }
}