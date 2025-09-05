import java.util.*;

class Solution {
    public int rearrangeCharacters(String s, String target) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        int count = 0;
        while (true) {
            StringBuilder formed = new StringBuilder();
            Stack<Character> temp = new Stack<>();

            for (int i = 0; i < target.length(); i++) {
                char t = target.charAt(i);
                boolean found = false;

                while (!stack.isEmpty()) {
                    char top = stack.pop();
                    if (top == t && !found) {
                        formed.append(top);
                        found = true;
                        break;
                    } else {
                        temp.push(top); // keep aside
                    }
                }

                // restore skipped chars back into stack
                while (!temp.isEmpty()) {
                    stack.push(temp.pop());
                }

                if (!found) {
                    return count; // can't build further
                }
            }

            if (formed.toString().equals(target)) {
                count++;
            }
        }
    }
}
