public class Task {
    public static void main(String[] args) {
        String[] array = {"paris", "london", "madrid"};
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1);
            System.out.println(array[i]);
        }
    }
}