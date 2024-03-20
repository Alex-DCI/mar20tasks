public class Task {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            boolean plural = i > 1;
            System.out.println("There " + (plural ? "are " : "is ") + i + " cup" + (plural ? "s" : "") + " on a table.");
        }
    }
}