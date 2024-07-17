import java.util.*;
class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String[] words = s.split("\\s+"); // Use \\s+ to handle multiple spaces
        for (String word : words) {
            if (!word.isEmpty()) { // To avoid pushing empty strings
                st.push(word);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            if (!st.isEmpty()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}