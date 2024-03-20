public class Task {
    private static final char[] upperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] lowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] spec = {'!', '$', '&', '@', '?'};
    private static final char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void main(String[] args) {
        String password;
        while(true) {
            password = generate();
            if (!contains(upperCase, password)) continue;
            if (!contains(lowerCase, password)) continue;
            if (!contains(spec, password)) continue;
            if (contains(nums, password)) break;
        }
        System.out.println("Your new password is " + password);
    }
    private static String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int rand = (int) (Math.random() * 67);
            if (rand < 26) sb.append(upperCase[rand]);
            else if (rand < 52) sb.append(lowerCase[rand - 26]);
            else if (rand < 57) sb.append(spec[rand - 52]);
            else sb.append(nums[rand - 57]);
        }
        return sb.toString();
    }
    private static boolean contains(char[] array, String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == word.charAt(i)) return true;
            }
        }
        return false;
    }
}