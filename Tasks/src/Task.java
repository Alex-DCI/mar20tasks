public class Task {
    public static void main(String[] args) {
        String source = "AnyStringYouWantToCheck";
        int counter = 0;
        for (int i = 0; i < source.length(); i++) {
            char c = Character.toLowerCase(source.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') counter++;
        }
        System.out.println(counter);
    }
}