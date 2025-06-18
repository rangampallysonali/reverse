public class Example {
    public String reverseWordInMyString(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);
            }
            reversedString += reverseWord + " ";
        }
        return reversedString.trim();
    }

    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.reverseWordInMyString("Welcome to BeginnersBook"));
        System.out.println(obj.reverseWordInMyString("This is an easy Java Program"));
    }
}

