class StringProcessor {

    String reverseString(String str) {

        if (str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1)
                + reverseString(str.substring(0, str.length() - 1));
    }

    int countVowels(String str) {

        if (str.length() == 0) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(0));
        int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? 1 : 0;

        return count + countVowels(str.substring(1));
    }

    public static void main(String[] args) {

        StringProcessor sp = new StringProcessor();
        String text = "Tony Stark";

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + sp.reverseString(text));
        System.out.println("Vowels: " + sp.countVowels(text));
    }
}
