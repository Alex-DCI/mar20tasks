public class Task {
    public static void main(String[] args) {
        reverse("AnyStringYouWantToReverse");
    }
    private static void reverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) System.out.println(s.charAt(i));
    }
}