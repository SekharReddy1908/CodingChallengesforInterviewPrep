// Problem Statement:
// Given a string that contains words enclosed in curly braces {} (like "java is good {for} in {ibm}"),
//  write a method that extracts and returns all the words inside the braces as a list

import java.util.Stack;

public class ReverseWithinBraces {
    public static void main(String[] args) {
        String input = "java is good {language} for {new learnners}";
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean insideBraces = false;

        for (char ch : input.toCharArray()) {
            if (ch == '{') {
                insideBraces = true;
                result.append(ch); // Keep the opening brace
            } else if (ch == '}') {
                // Reverse the content inside braces
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(ch); // Keep the closing brace
                insideBraces = false;
            } else if (insideBraces) {
                stack.push(ch); // Push characters into stack
            } else {
                result.append(ch); // Normal character
            }
        }

        System.out.println(result.toString());
    }
}