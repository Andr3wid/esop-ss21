package FinalExam;

public class ex04 {

    public static void main(String[] args) {
        String alphabet = "abcdefg";
        System.out.println(encryptCaesar(alphabet, 2));

        String clearText = "rust is better than java!";
        System.out.println(encryptCaesar(clearText, 4));
    }

    public static String encryptCaesar(String clearText, int offset) {
        StringBuilder cipherBuilder = new StringBuilder();
        char[] chars = clearText.toCharArray();

        for (char character : chars) {
            if (character >= 'a' && character <= 'z') {
                cipherBuilder.append((char) (character + offset));
                // to account for "alphabetic overflow" we can use the line below instead; test with "xyz"
                // cipherBuilder.append((char) ((((character + offset) - 'a') % 26) + 'a'));
            } else {
                cipherBuilder.append(character);
            }
        }

        return cipherBuilder.toString();
    }

}
