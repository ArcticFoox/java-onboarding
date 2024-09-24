package onboarding;

import java.util.Stack;

public class Problem2 {

    public static String solution(String cryptogram) {
        Problem2 T = new Problem2();
        String decryptogram = "";
        decryptogram = T.decrypt(cryptogram);

        return decryptogram;
    }

    public String decrypt(String cryptogram) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : cryptogram.toCharArray()) {
            compareToGrams(stack, c);
        }

        while (!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public void compareToGrams(Stack<Character> stack, char c) {
        if (!stack.empty() && stack.peek() == c) {
            stack.pop();
            return;
        }

        stack.add(c);
    }
}
