package dsa_patterns;

import java.util.Stack;

public class StackEasyQuestions {

    public static void main(String[] args) {


    }

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                st1.pop();
            } else {
                st1.push(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                st2.pop();
            } else {
                st2.push(ch);
            }
        }

        return st1.size() == st2.size();

    }
}
