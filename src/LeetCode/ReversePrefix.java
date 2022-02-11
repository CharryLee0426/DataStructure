package LeetCode;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        int position = word.indexOf(ch);
        char[] wordArray = word.toCharArray();
        if (position == -1) {
            return word;
        } else {
            for (int i = 0; i <= position / 2; i++) {
                char temp = wordArray[i];
                wordArray[i] = wordArray[position - i];
                wordArray[position - i] = temp;
            }
        }
        return new String(wordArray);
    }
}
