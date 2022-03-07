import org.apache.commons.lang3.StringUtils;

public class TextFormatter {
    public void printSentence(String string) {
        String[] sentences = string.split("\\. ");
        for (String sentence : sentences) {
            if (getCountOfWords(sentence) >= 3 && getCountOfWords(sentence) <= 5) {
                System.out.println(sentence);
            } else if (isWordPalindrome(sentence)) {
                System.out.println(sentence);
            }
        }
    }

    public int getCountOfWords(String string) {
        return string.trim().split(" ").length;
    }

    public boolean isWordPalindrome(String string) {
        String[] words = string.trim().split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase(StringUtils.reverse(word))) {
                return true;
            }
        }
        return false;
    }
}
