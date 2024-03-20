public class Task {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("There " + (i > 1 ? "are " : "is ") + i + " cup" + (i > 1 ? "s" : "") + " on a table.");
        }
    }
}